package innerClass;

public class Outer {
	
	int ov = 10;
	static int osv = 100;
	
	//내부 인스턴스 클래스
	class InnerInstance{
		int iiv = 20;
		
		public void innerInstanceFunction() {
			System.out.println("인스턴스 클래스 메소드 호출됨");
		}
	}
	
	//내부 스태틱 클래스
	static class InnerStatic{
		int isv = 30;
		
		public void innerStaticFunction() {
			System.out.println("스태틱클래스 메소드 호출됨");
		}
	}
	
	public void show() { // Outer클래스의 메소드 안에서 내부 인스턴스 클래스, 내부 스태틱클래스의 객체 생성 및 멤버 사용
		InnerInstance ii = new InnerInstance();
		System.out.println(ii.iiv);
		ii.innerInstanceFunction();
		
		InnerStatic is = new InnerStatic();
		System.out.println(is.isv);
		is.innerStaticFunction();
	}
	
	public void outerFunction() {
		// 어떤 클래스가 만약 특정 클래스의 특정 메소드 안에서만 사용될 때
		// 지역클래스로 만들어서 간단히 사용
		
		class InnerLocal{ // 지역클래스
			int ilv = 40;
			
			public void innerLocalFunction() {
				System.out.println("지역클래스 메소드 호출됨");
			}
			
		}
		
		InnerLocal il = new InnerLocal();
		
		System.out.println(il.ilv);
		il.innerLocalFunction();
		
		
		
		
	}

}
