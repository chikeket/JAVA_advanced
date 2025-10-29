package day1;

public class 배열과반복문2 {

	public static void main(String[] args) {
		// 성적 5개
		int[] scores = { 5, 4, 3, 5, 2 };

		int cnt = 0;
		// 성적 출력
		for (int score :scores) {
			// 출력
			System.out.print("성적 : " + score);
			// 통과여부출력 ( 3점이상이면 success / fail)
			if (score >= 3) {
				System.out.println("success");
				cnt++;
			} else {
				System.out.println("fail");
			}
		}
		System.out.println("통과된 건수 : " + cnt);

	}

}
