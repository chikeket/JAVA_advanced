package day1;
/*
 * 근무시간(9~18) 맞으면 Y / N
 */
public class 조건문 {

	public static void main(String[] args) {
		int workTime = 10;
		if(9<=workTime && workTime<=18) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}

		int sTime = 10;
		int eTime = 17;
		int totalTime = eTime - sTime -1;
		if(totalTime>=8) {
			System.out.println("초과근무");
		}
			System.out.println("정상근무");
	}

}
