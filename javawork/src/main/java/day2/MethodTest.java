package day2;

public class MethodTest {
	public static void main(String[] args) {		
		printString("헤더가맞다");
		printString("푸터가맞다");
		
		sum(5,4);
		int mulResult= mul(5,4);
		System.out.println(mulResult);
		
		System.out.println(total(2,3,4,10));
		System.out.println(total(6,8,11,15,58,28));
		System.out.println(total(9,1236,3658,785));
	}
	static int total(int ... score) {
		int result =1;
		for(int value : score) {
			result *= value;
		}
		return result;
	}
	//매개 있, 리턴 없
	static void sum(int a, int b) {	
		int result = a+b;
		System.out.println(result);
		return ;
	}
	//매개 있, 리턴 있
	static int  mul(int a, int b) {	
		int result = a*b;		
		return result;
	}
	
	//중복되는 코드 => 메서드
	static void printHead(){
		System.out.println("============");
		System.out.println("===header===");
		System.out.println("============");
		
	}
	static void printFoot(){
		System.out.println("============");
		System.out.println("===footer===");
		System.out.println("============");
		
	}
	static void printString(String str){
		System.out.println("============");
		System.out.println("==="+str+"===");
		System.out.println("============");
		
	}
}
