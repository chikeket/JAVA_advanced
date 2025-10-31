package day3.shape;

public class Circle extends Shape {
	private String color; // 면색상

	@Override
	public String toString() {
		return "Circle [sX=" + getsX() + ", eX=" + geteX() + ", sY=" + getsY() + ", eY=" + geteY() + "]";
	}

	@Override
	public void draw() {
		System.out.println("원을 그리다");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
