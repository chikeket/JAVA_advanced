package day2;

public class StringUtilTest {

	public static void main(String[] args) {
		String year = StringUtil.getYear("19890328");
		System.out.println(year);

		String year2 = StringUtil.getJoinYear(2025, 10, 29);
		System.out.println(year2);// "2025-10-20"
		String[] result = year2.split("-");
		for (String resul : result) {
			System.out.println(resul);
		}
		System.out.println(StringUtil.getSplitYear(year2));
		
	}

}
