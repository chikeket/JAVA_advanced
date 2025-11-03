package day4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import day3.emp.Employee;

public class EmpSalary {
	String filename;
	List<Employee> list = new ArrayList<>();
	private long sum;

	public long getSum() {
		return sum;
	}

	public EmpSalary(String filename) {		
		this.filename = filename;
	}

	// 초기화
	public void init() {
		Scanner scanner;
		String emp = null;		
		try {
			scanner = new Scanner(new File(filename));
			while(scanner.hasNext()) {		
				emp = scanner.nextLine();
				String[] emplist = emp.split(",");		
				//2. for문으로 한줄씩 읽어내기
//			System.out.println(emp);
				int no = Integer.parseInt(emplist[0]);
				String name = emplist[1];
				long salary = Long.parseLong(emplist[7]);
				//3. 사번, 이름, 급여출력
				System.out.println(no+name+salary);
				
				//4. 급여합계 출력
				
				list.add(new Employee(no,name,salary));
			}
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		}
	}

	// 급여계산
	public void cal() {
		//명령형 프로그래밍( 절차지향, 객체지향 ) why
		for(Employee e : list) {
			sum += e.getSalary();
		}
		
		//선언형 프로그래밍(함수형) what <-이 방식이 훨씬 빠름
		sum = list.stream().mapToLong(Employee::getSalary).sum();
	}

	// 정렬
	public void sort() {
		Comparator<Employee> compare = (o1, o2)->(o1.getFirstName().compareTo(o2.getFirstName()) );
		list.sort( compare );
	}

	// 출력
	public void print() {
		for(Employee emps : list) {
			System.out.println(emps);
		}
	}
}
