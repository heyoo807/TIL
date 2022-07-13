package interfaceTest;

public class Main {
	public static void main(String[] args) {
		Soldier sm = new SecondSoldier(); // 업캐스팅
		sm.eat();
		sm.walk();
		
	}
}
