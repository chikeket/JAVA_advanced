package day2;
/**
 * 주민번호로 출생년도 추출
 * @param id 주민번호
 * @return 년도 4자리
 * 
 */
public class StringUtil {
	
	//주민번호로 출생년도 추출
	public static String getYear(String id) {
		if (id ==null) {
			return "생년월일을 입력해주세요";
		}
		String result =  id.substring(0, 4);
		return result;
	}
	//년, 월, 일을 join - 
	public static String getJoinYear(int year,int month,int day) {	
		return String.join("-", Integer.toString(year) , Integer.toString(month), Integer.toString(day) );
	}
	//년, 월, 일을 나눠서 년도만 출력 포멧형태는 y-m-d
		public static String getSplitYear(String date) {	
			String[] result = date.split("-");
			return result[0];
		}
}
