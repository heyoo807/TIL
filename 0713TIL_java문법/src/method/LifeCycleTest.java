package method;

public class LifeCycleTest {
	
	public static int changeA() {
		int b = 1100;
		return 1000;
	}
	
	
	public static void main(String[] args) {
		int a = 100;
		
		a = LifeCycleTest.changeA();
		System.out.println(a);
//		System.out.println(b); // main메소드 밖 changeA메소드 안에 b는 지역변수이므로 메인메소드안에서 초기화 해야지 에러 x
		
		for(int i = 0; i <5; i++) {
			// 해당 for문안에서만 i 사용 가능
		}
		
		for(int i = 0; i < 4; i++) {
			// 해당 for문 안에서만 i 사용 가능
		}
	}
}


	
