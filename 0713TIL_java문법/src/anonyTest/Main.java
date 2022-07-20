package anonyTest;

public class Main {
	public static void main(String[] args) {
		
		Soldier s = new Soldier() {
			
			@Override
			public void work() {
				// TODO Auto-generated method stub
				System.out.println("이등병이 일한다");
			}
			
			@Override
			public void eat() {
				// TODO Auto-generated method stub
				System.out.println("이등병이 먹는다");
			}
			
			@Override
			public void sleep() {
				// TODO Auto-generated method stub
				System.out.println("이등병이 잠잔다");
			}
			
		};
		s.eat();
		
		Car c = new Car() {

			public void openRoof() {
				System.out.println("지붕을 열었습니다");
			}

			@Override
			public void show() {
				// TODO Auto-generated method stub
				System.out.println("override된 show");
			}
			
		};
		
		c.go();
		c.show();
//		c.openRoof(); 
// 자식에서 새롭게 만든 메소드는 업캐스팅되면 사용이 불가능하다
	}
}
