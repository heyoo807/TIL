package method;

import java.util.Scanner;

public class MethodTask {
	
	public static boolean isAdult(int age) {
		return age > 19;
//		if(age > 19) {
//			return true; // return ������ �޼ҵ�� ��� ����
//		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� >> ");
		int age = sc.nextInt();
		
		if(MethodTask.isAdult(age)) {
			System.out.println("������ �� �ֽ��ϴ�");
		}else {
			System.out.println("������ �� �����ϴ�");
		}
		
	}
	
	
	
}
