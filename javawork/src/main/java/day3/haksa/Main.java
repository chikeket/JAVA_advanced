package day3.haksa;

import java.util.ArrayList;



/*
 * 패키지, import
 */
public class Main {

	public static void main(String[] args) {
		Member student = new Student(1,"고길동", 4);
		
		Member professor = new Professor(100,"나교수", 4000);
		
		ArrayList<Member> list = new ArrayList<>();
		list.add(student);		
		list.add(professor);		
		
		for(Member member : list ) {
			//다형성
			System.out.println(member.toString());
		}
		for(Member member : list ) {
//			System.out.println((member instanceof Student)?((Student)member).getGrade():((Professor)member).salary);
			if(member instanceof Student) {
				Student temp = (Student)member; //강제형변환
				System.out.println(temp.getGrade());
			}else {
				//교수타입 형변환 -> 급여출력
				Professor temp = (Professor)member; //강제형변환
				System.out.println(temp.salary);
			}
		}
		System.out.println(student.name);		
		System.out.println(((Student)student).getGrade());		
	}

}
