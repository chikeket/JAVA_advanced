package day3.haksa;

public class Professor extends Member {
	
	int salary;
	public Professor() {}
	public Professor(int no, String name, int salary) {		
		this.no = no;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Professor [salary=" + salary + ", no=" + no + ", name=" + name + "]";
	}
	
}
