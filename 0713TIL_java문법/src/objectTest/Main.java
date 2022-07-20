package objectTest;

public class Main {
	public static void main(String[] args) {
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		
		System.out.println(i1 == i2); //false 
		System.out.println(i1.equals(i2)); //true
		System.out.println(i1.toString()); // 10
		
		Car c1 = new Car(1234);
		Car c2 = new Car(1234);
		System.out.println(c1 == c2); //false
		
		System.out.println(c1.equals(c2)); //Car클래스에서 equals()메소드 오버라이딩 x-> false리턴
		System.out.println(c1.equals(c2)); //Car클래스에서 equals()메소드 오버라이딩 o-> true리턴
		System.out.println(c1.toString()); //Car클래스에서 toString()메소드 오버라이딩 x->objectTest.Car@7852e922
		System.out.println(c1.toString()); //Car클래스에서 toString()메소드 오버라이딩 o ->자동차 번호판 : 1234
		System.out.println(c2); // 1234
		// 객체가 println안에 쓰이면 toString()메소드가 생략된 상태
		// 따라서 toString()을 오버라이딩하면 출력할 때 모양을 지정할 수 있다
		
		System.out.println(c1.hashCode()); //Car클래스에서 hashCode()메소드 오버라이딩 x->2018699554
	
		System.out.println(c1.hashCode());//Car클래스에서 hashCode()메소드 오버라이딩 o->1234
		
		
		
	}
}
