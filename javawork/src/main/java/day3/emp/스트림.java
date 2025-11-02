package day3.emp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class 스트림 {
	public static void main(String[] args) {
		String[] strArr = {"키위","포도","바나나","사과","감","사과"};
		Stream.of(strArr).sorted().limit(3).forEach(System.out::println);
		
		//사과가 몇개 잇나? filter count
		long cnt = Stream.of(strArr).filter((word) -> word.equals("사과")).count();
		System.out.println("사과 갯수는 : "+cnt);
		//LIst<String> list = Arrays.asList("키위","포도","바나나","사과","감","사과");
		
		List<Employee> list = Arrays.asList(
				new Employee(100, "가길동", 4000),
				new Employee(101, "나감찬", 2000),
				new Employee(102, "다유신", 3000)
				);
		
		//급여합계 map섞기.
		int sum=  list.stream().mapToInt(e -> (int)e.getSalary() ).sum();
		System.out.println(sum);
	}
}
