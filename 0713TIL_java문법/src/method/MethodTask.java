package method;

import java.util.Scanner;

public class MethodTask {
	
	public static boolean isAdult(int age) {
		return age > 19;
//		if(age > 19) {
//			return true; // return 만나면 메소드는 즉시 종료
//		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이 입력 >> ");
		int age = sc.nextInt();
		
		if(MethodTask.isAdult(age)) {
			System.out.println("구매할 수 있습니다");
		}else {
			System.out.println("구매할 수 없습니다");
		}
		
	}
	
	
	
}
