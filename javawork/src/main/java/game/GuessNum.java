package game;

import java.util.Scanner;

public class GuessNum {
public void start() {
	Scanner scanner = new Scanner(System.in);
	// 반복문
	Boolean onOff = true;
	while (onOff) {
		int user = 0;
		int computer = (int) (Math.random() * 100 + 1);
		int cnt = 0;
		// 반복문
		while (true) {

			// 메뉴출력
			System.out.println("1~100 사이 숫자 입력");

			// 사용자 값을 입력
			user = scanner.nextInt();
			if(user<0 && user > 100) {
				System.out.println("범위를 벗어난 숫자입니다");
				continue;
			}
			if (user > computer) {
				cnt++;
				System.out.println("입력한 값보다 작습니다.");
			} else if (user < computer) {
				cnt++;
				System.out.println("입력한 값보다 큽니다.");
			} else {
				cnt++;
				System.out.println("정답입니다.");
				break;
			}

		}
		System.out.println("시도횟수 : " + cnt);
		System.out.println("재시작?");
		onOff = scanner.nextBoolean();
		if(onOff) {
			System.out.println("재시작");
			continue;
		}else {
			System.out.println("종료");	
			break;
		}
		
	}
	
}
}
