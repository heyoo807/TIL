package method;

public class MethodTest {
	
	// overloading
	// �Ű����� Ÿ�԰� ������ ���� ���� 
	
	public static void add(int num1, int num2) {
		System.out.println("1�� �����");
		System.out.println(num1 + num2);
	}

/*	public static void add(int n1, int n2) {
		System.out.println("�Ű������� �̸����δ� ���� �Ұ���");
	}*/
	public static void add(int num1, int num2, int num3) {
		System.out.println("2�� �����");
		System.out.println(num1 + num2 + num3);
	}
	
	
	public static void add(int num1, double num2) {
		System.out.println("3�� �����");
		System.out.println(num1 + num2);
	}
	
	public static void add(double num1, int num2) {
		System.out.println("Ÿ������ �����ϱ� ������ ����");
	}
	
	// ���� Ÿ�����δ� ������ �� ����
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
