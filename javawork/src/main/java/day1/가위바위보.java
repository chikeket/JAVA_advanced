package day1;

import java.util.Scanner;

public class 가위바위보 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String userStr;
		int user = 0;
		int computer = 0;
		int win = 0;
		int draw = 0;
		int lose = 0;
		// 반복문
		while (true) {

			// 메뉴출력
			System.out.println("1가위 2바위 3보 0종료");

			// 사용자 값을 입력
			userStr = scanner.nextLine();
			computer = (int) (Math.random() * 3 + 1);
			if (userStr.equals("가위")) {
				user = 1;
			} else if (userStr.equals("바위")) {
				user = 2;
			} else if (userStr.equals("보")) {
				user = 3;
			} else if (userStr.equals("종료")) {
				user = 0;
			} else {
				user = 4;
			}
			// 0이면 종료
			if (user == 0)
				break;

			// 1~3이 아니면 다시 입력
			if (user > 3)
				continue;

			// 승패 판정 로직
			if (user == computer) {
				System.out.println("무승부");
				draw++;
			} else if (user == 1 && computer == 3 || user == 2 && computer == 1 || user == 3 && computer == 2) {
				System.out.println("승");
				win++;
			} else {
				System.out.println("패");
				lose++;
			}
			System.out.println("현재전적" + win + "승" + draw + "무" + lose + "패");
		}
		System.out.println("최종전적" + win + "승" + draw + "무" + lose + "패");
		scanner.close();
	}

}
