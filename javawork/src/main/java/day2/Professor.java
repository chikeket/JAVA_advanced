package day2;

public class Professor {
	// 필드
	int no;
	String name;
	String addr;
	int roomNo;

	//생성자
	public Professor() {
		this(0,"무명"); //this() : 다른 생성자를 호출
	}

	public Professor(int no, String _name) {		
		this.no = no;
		name = _name;
	}

	//메서드
}
