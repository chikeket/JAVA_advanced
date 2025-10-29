package day1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class 셋 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> score = new HashSet<>();
		
		score.add("사과");
		score.add("사과");
		score.add("바나나");
		
		System.out.println(score);
		
		//전체조회 index 없음
		Iterator<String> iter = score.iterator();
		while(iter.hasNext()) {
			String item = iter.next();
			System.out.println(item);
		}
		
		//리스트를 셋에 넣으면 중복값 제거
		List<String> names = (List<String>)Arrays.asList("사과","사과","포도");
		
		Set distinctName = new HashSet(names);
		System.out.println(distinctName);
		

	}

}
