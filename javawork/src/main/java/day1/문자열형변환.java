package day1;
/*
 * 래퍼클래스
 * char      int     long flat  double <- 8
 * Character Integer Long Float Double
 * 1. 객체화 null값 가능 파라미터 ? age= --> Integer age
 * 2. 형변환
 * 3. 박싱/언박싱
 */
public class 문자열형변환 {

	public static void main(String[] args) {
		String strAge = "20";
		int age = Integer.parseInt(strAge);
		//String -> int 
		System.out.println(strAge + -1);
		System.out.println(age-1);
		//int -> String
		strAge = Integer.toString(age);		

	}

}
