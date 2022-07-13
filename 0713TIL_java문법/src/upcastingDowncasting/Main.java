package upcastingDowncasting;

public class Main {
	
	public static void test(Parent c) {
		
	}
	
	public static void main(String[] args) {
		
		Parent p = new Parent();
		Child  c = new Child();
		Child2 c2 = new Child2();
		
		Object[] ar = {"안녕", p, c, c2};
		
		Main.test(c); // 업캐스팅
		Main.test(c2); // 업캐스팅
		
		//타입확인메소드
		//인스턴스 instanceof 클래스 : 인스턴스가 클래스타입이니 ? 맞으면 true, 아니면 false
		
		System.out.println("java의 모든 객체들은 최상위클래스 Object클래스의 타입이니 ?");
		System.out.println(p instanceof Object);
		System.out.println(c instanceof Object);
		System.out.println(c2 instanceof Object);
		 
		System.out.println("**부모클래스가 자식클래스 타입이니 ?**");
		System.out.println(p instanceof Child); // 부모클래스가 자식클래스타입 이니 ?  // false
		System.out.println(p instanceof Child2); // 부모클래스가 자식클래스타입이니 ?  // false
		
		System.out.println("**자식클래스가 부모클래스 타입이니 ? **");
		System.out.println(c instanceof Parent); //true
		System.out.println(c2 instanceof Parent); //true
		
		System.out.println("업캐스팅된 자식클래스객체는 부모클래스타입이니, 자식클래스타입이니 ? "); //부모타입 o, 자식 타입 o
		Parent up = c;
		Parent up2 = c2;
		System.out.println(up instanceof Parent); //true
		System.out.println(up instanceof Child); //true
		
		System.out.println(up2 instanceof Parent); //true
		System.out.println(up2 instanceof Child2); //true
		
		System.out.println(up2 instanceof Child); //false // 공통된 부모를 상속받은 자식끼리는 타입을 공유하지 않음
		
		
		
		
		
	}
}
