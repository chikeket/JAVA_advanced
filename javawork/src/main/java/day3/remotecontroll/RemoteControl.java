package day3.remotecontroll;

public interface RemoteControl {
	// public static final 생략 가능 보통 상수표현할때 이렇게 되는거임
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상메서드[public abstract ] 생략가능
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}
