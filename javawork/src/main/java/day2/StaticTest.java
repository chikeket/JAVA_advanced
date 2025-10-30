package day2;
/*
 * static(정적) 필드, 메서드
 */
public class StaticTest {
	public static void main(String[] args) {
		//스태틱변수를 표현할때는 이 표현이 더 정확함 객체생성없이도 스태틱 변수는 사용이 됨
				Student.schoolName = "돌담";
				
		Student s1 = new Student(1, "둘리"); 
		Student s2 = new Student(2, "고길동"); 
		
		//둘다 가능하지만 스태틱변수를 표현할때는 첫번째의 표현이 더 정확함
		s1.schoolName = "어떻한담";
		
		
		System.out.println(s1.schoolName);
		System.out.println(s1.name);
		
		System.out.println(s2.schoolName);
		System.out.println(s2.name);
	}
}
