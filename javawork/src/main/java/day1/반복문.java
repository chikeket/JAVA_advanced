package day1;

public class 반복문 {
	public static void main(String[] args) {
		//A ~ Z까지 출력하기 A가 65임 Z가 91임
		for(int i='A'; i<='Z'; i++) {
			System.out.println((char)(i));
		}
		
		//A ~ Z까지 출력하기 A가 65임 Z가 91임
				for(int i=42; i<=51; i++) {
					System.out.print(i+" "+(char)(i));
				}
	}
}
