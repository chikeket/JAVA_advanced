package day2;

public class CalcTest {

	public static void main(String[] args) {
		Calcurator calcul = new Calcurator(4,7);
		
		calcul.calSum();
		System.out.println(calcul.result);
		
		calcul.calmin();
		System.out.println(calcul.result);
		
		Calcurator calcul2 = new Calcurator();
		calcul2.setN1(12);
		calcul2.calCircleArea();
		System.out.println(calcul2.getCircleResult());
		
		System.out.println(Calcurator.staticCalCircleArea(5));
	}
}
