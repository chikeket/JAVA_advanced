package game;

import java.util.Scanner;

//1. 클래스(설계도) 선언
public class RockPaperScissors {
	String userStr;
	int user, computer, win, draw, lose = 0;

	// 승패 판정 로직
	void printResult() {
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
	}//end of printResult()

	// 현재 전적 출력
	void printReport() {
		System.out.println("현재전적" + win + "승" + draw + "무" + lose + "패");
	}//end of printReport()

	// 최종 결과 출력
	void printFianlReport() {
		System.out.println("최종전적" + win + "승" + draw + "무" + lose + "패");
	}//end of printFianlReport()

	public void start() {
		Scanner scanner = new Scanner(System.in);

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
			printResult();

			printReport();
		}
		printFianlReport();
		

	}// end of start()
}
