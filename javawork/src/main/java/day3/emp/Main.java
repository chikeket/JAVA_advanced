package day3.emp;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(
				new Employee(100, "가길동", 4000),
				new Employee(101, "나감찬", 2000),
				new Employee(102, "다유신", 3000)
				);
		EmployeeList emplist = new EmployeeList(list);
		
		//전체출력
//		emplist.selectAll();
		System.out.println(emplist.findById(100));
		System.out.println(emplist.findByName("나감찬")); 
		System.out.println("이름순 정렬====");
		System.out.println(emplist.findOrderByName()); 
		System.out.println("급여순 정렬====");
		System.out.println(emplist.findOrderBySalary()); 

	}

}
