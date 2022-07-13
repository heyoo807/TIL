package method;

public class MethodTest {
	
	// overloading
	// 매개변수 타입과 개수로 구분 가능 
	
	public static void add(int num1, int num2) {
		System.out.println("1번 실행됨");
		System.out.println(num1 + num2);
	}

/*	public static void add(int n1, int n2) {
		System.out.println("매개변수의 이름으로는 구분 불가능");
	}*/
	public static void add(int num1, int num2, int num3) {
		System.out.println("2번 실행됨");
		System.out.println(num1 + num2 + num3);
	}
	
	
	public static void add(int num1, double num2) {
		System.out.println("3번 실행됨");
		System.out.println(num1 + num2);
	}
	
	public static void add(double num1, int num2) {
		System.out.println("타입으로 구분하기 때문에 가능");
	}
	
	// 리턴 타입으로는 구분할 수 없다
/*	public static int f(int num1) {
		return num1;
	}
	
	public static double f(int num1) {
		return num1;
	}
	*/
	

	
	public static void main(String[] args) {
		
		MethodTest.add(10, 10);
		MethodTest.add(10,  10, 10);
		MethodTest.add(10, 10.0);
		MethodTest.add(10.0, 10);
	}
}
