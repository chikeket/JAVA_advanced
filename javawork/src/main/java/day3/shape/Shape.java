package day3.shape;
/*
 * abstract(추상적인 기능 부여하는것)
 * abstract가 붙은 메소드는 상속받은 자식에서 abstract가 정의된 메소드에 대해서 실행되는 블록을 무조건 정의해야 한다
 */
public abstract class Shape {
	
private int sX;
private int eX;
private int sY;
private int eY;
private int thick;

public Shape() {}

public Shape(int sX, int eX, int sY, int eY) {	
	this.sX = sX;
	this.eX = eX;
	this.sY = sY;
	this.eY = eY;
}

public abstract void draw() ;

public int getsX() {
	return sX;
}
public void setsX(int sX) {
	this.sX = sX;
}
public int geteX() {
	return eX;
}
public void seteX(int eX) {
	this.eX = eX;
}
public int getsY() {
	return sY;
}
public void setsY(int sY) {
	this.sY = sY;
}
public int geteY() {
	return eY;
}
public void seteY(int eY) {
	this.eY = eY;
}
public int getThick() {
	return thick;
}
public void setThick(int thick) {
	this.thick = thick;
}
@Override
public String toString() {
	return "Shape [sX=" + sX + ", eX=" + eX + ", sY=" + sY + ", eY=" + eY + ", thick=" + thick + "]";
}


}
