package day2;

public class Student {

	static String schoolName = "예담";

	int no;
	String name;
	String addr;

	public Student() {
	}

	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}

	public Student(int no, String name, String addr) {

		this.no = no;
		this.name = name;
		this.addr = addr;
	}

	void addLecture() {
		System.out.println("수강신청");
	}
}
