package day3.shape;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
//		Shape s = new Line(2,3,1,4,15); 
//		System.out.println(s.toString());
		ArrayList<Shape> list = new ArrayList<>();
		list.add(new Line());
		list.add(new Circle());
		list.add(new Rect());
		
		for(Shape s : list) {
			s.draw(); //다형성 3번
		}
		
	}
	
}
