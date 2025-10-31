package day3.shape;

public class Line extends Shape {
	private int style;

	public Line() {
	}

	public Line(int sX, int eX, int sY, int eY, int style) {
		// 무조건 부모생성자부터 먼저 정의되고 자식쪽에 것들을 정의해야한다 반대로 하면 에러남
		super(sX, sY, eX, eY);
		this.style = style;
//		setsX(sX);
//		seteX(eX);
//		setsY(sY);
//		seteY(eY);
	}

	@Override
	public String toString() {
		return "Line [sX=" + getsX() + ", eX=" + geteX() + ", sY=" + getsY() + ", eY=" + geteY() + ", style=" + style
				+ "]";
	}

	@Override
	public void draw() {
		System.out.println("선을 그리다");
	}
	
}
