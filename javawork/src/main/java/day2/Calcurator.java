package day2;

public class Calcurator {
int n1;
int n2;
int result;
double circleResult;
public Calcurator(int n1, int n2) {	
	this.n1 = n1;
	this.n2 = n2;
}

public Calcurator() {}

public void calSum() {
	result = n1+n2;
	
}

public void calmin() {
	result = n1-n2;
	
}

public void calCircleArea() {
	circleResult = Math.PI*n1*n1;
	
}

public static double staticCalCircleArea(int r) {
	return Math.PI*r*r;
	
}

public int getN1() {
	return n1;
}

public void setN1(int n1) {
	this.n1 = n1;
}

public double getCircleResult() {
	return circleResult;
}

}
