package interfaceTest;

public interface Soldier {
//interface : 추상 클래스는 추상클래스인데, 추상 메소드만 존재하는 메소드
// 모호성으로 인한 다중상속이 원칙적으로는 허용되지 않으나, 인터페이스의 경우 다중 상속을 허용
	
	int num = 10; // static final 변수
	
	public abstract void eat();
	
	public abstract void walk();
}
