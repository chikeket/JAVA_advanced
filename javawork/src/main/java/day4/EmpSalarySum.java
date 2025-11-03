package day4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import day3.emp.Employee;

/*
 * 사원 급여 합계 계산
 * 
 * data(필드)
 *     List
 *     filename
 *     sum
 *     
 * 기능(메서드)
 *    List 초기화
 *    급여계산
 *    정렬
 *    출력
 */
public class EmpSalarySum {
	public static void main(String[] args) {
		//emp.txt
		//1. scanner		
		List<Employee> list = new ArrayList<>();
		Scanner scanner=null;
		try {
			scanner = new Scanner(new File("C:/Temp/emp.txt"));
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		}
		String emp = null;
		 int salartSum = 0;		 
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
			salartSum += Integer.parseInt(emplist[7]) ;
			list.add(new Employee(no,name,salary));
		}
		System.out.println("4. 급여합계 출력");
		System.out.println(salartSum);
		 //급여순으로 정렬해서 출력
		Comparator<Employee> compare = (o1, o2)->(o1.getFirstName().compareTo(o2.getFirstName()) );
//		list.sort((o1, o2) -> (int)(o1.getSalary()-o2.getSalary()));		
		list.sort( compare );
		for(Employee emps : list) {
			System.out.println(emps);
		}
		//스트림 Comparator.comparingInt( (o1, o2) -> (o1.getSalary()-o2.getSalary() ) )
		list.stream()
			.sorted( )
//			.forEach(e -> {System.out.println(e);});
			.forEach(System.out::println);
		
		
	}
}
