package day3.shape;

public class Rect extends Shape {
	private String color; // 면색상

	@Override
	public String toString() {
		return "Rect [sX=" + getsX() + ", eX=" + geteX() + ", sY=" + getsY() + ", eY=" + geteY() + "]";
	}

	@Override
	public void draw() {
		System.out.println("사각형을 그리다");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
