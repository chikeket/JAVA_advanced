package day1;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 배열과반복문3 {

	public static void main(String[] args) {
		
//		ArrayList<Integer> list1 = new ArrayList<Integer>();
//		list2.add(5);
//		list2.add(4);
//		list2.add(3);
//		list2.add(5);
//		list2.add(2);
		List<Integer> list2 = (List<Integer>)Arrays.asList(5, 4, 3, 5, 2);
		
		int cnt = 0;
		// 성적 출력
		for (int i = 0; i < list2.size(); i++) {
			// 출력
			System.out.print(i + 1 + "번째 성적 : " + list2.get(i));
			// 통과여부출력 ( 3점이상이면 success / fail)
			if (list2.get(i) >= 3) {
				System.out.println("success");
				cnt++;
			} else {
				System.out.println("fail");
			}
		}
		System.out.println("통과된 건수 : " + cnt);

	}

}
