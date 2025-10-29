package day1;

public class 실수유효자리 {

	public static void main(String[] args) {
		
		//double a = 1.2f; //자동형변환 됨 (작은값에서 큰값은 안됨)
		
		// float형
		float f = (float)0.1234567890123; // 유효자릿수 7자리
		System.out.println(f);
		
		// double형
		double d = 0.1234567890123456789; // 유효자릿수 15자리
		System.out.println(d);
	}

}
