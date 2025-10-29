package day1;

import java.util.HashSet;
import java.util.Set;

/*
 * 요구사항 :
 * 1. 난수 6개 생선 리스트 저장
 * 2. 1~15
 * 3. 중복값 허용 안됨
 */
public class 로또번호 {

	public static void main(String[] args) {
		// 리스트 변수 선언 ==> 중복값 제거하려면 Set을
		Set<Integer> numArr = new HashSet<>();
		// while(list.size() <6)
		int ranNum = 0;
		while (numArr.size() < 6) {
			// 난수생성(1~20)
			ranNum = (int) (Math.random() * 44 + 1);
			// 리스트에 추가 (add())
			numArr.add(ranNum);
		}


		// 결과출력
		System.out.println(numArr);
	}

}
