package day3.haksa;

public class Student extends Member {

	private int grade;
	public Student() {}
	public Student(int no, String name, int grade) {		
		this.no = no;
		this.name = name;
		this.grade = grade;
	}
	
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [grade=" + grade + ", no=" + no + ", name=" + name + "]";
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		super.update();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
}
