package day2;

/*
 * 테스트
 */
public class Main {

	public static void main(String[] args) {
		// 2. 객체 생성
		Student student = new Student();
		student.no = 200601;
		student.name = "고길동";
		student.addr = "대구";
		
		Student s3 = new Student(136,"삼길동");
		System.out.println(s3.no+ s3.name+ s3.addr);
		
		Student s4 = new Student(138,"사길동","서울");
		System.out.println(s4.no+ s4.name+ s4.addr);
		
		Professor prof = new Professor();
		
		//3. 사용
		student.addLecture();
		
		//얕은복사
		Student student2 = student;
//		student2.name = "홍길동";
		
		System.out.println(student.name);
		System.out.println(student == student2);
	}

}
