package loginTest;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		User[] users = new User[3];
		int whileNum = 0;
		//User 클래스 타입의 배열 users 초기화 , 3개 방,  User타입 객체가 users 배열 안 요소로
		
		//로그인 회원가입 기능 구현하기
		while(whileNum == 0) {
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 나가기");
			int choice = Integer.parseInt(sc.nextLine());

			switch(choice) {
			case 1:
				User u = new User();
				System.out.println("이름: ");
//				u.name = sc.nextLine();
				u.setName(sc.nextLine());
				
				System.out.println("ID: ");
				u.setId(sc.nextLine());
				
				System.out.println("PW: ");
				u.setPw(sc.nextLine());
				
				for(int i = 0; i < users.length; i++) {
					if(users[i] == null) {
						users[i] = u;
						break;
					}
				}
				break;
			case 2:
				System.out.println("ID: ");
				String id = sc.nextLine();
				System.out.println("PW: ");
				String pw = sc.nextLine();
				// 로그인이 실패하면 아이디 또는 비밀번호를 다시 확인해주세요 출력하기
				
				boolean check = false; // flag변수
				
				//빠른 for문
/*				for(User user: users) {
					if(user == null) break;
					
					if(user.getId().equals(id) && user.getPw().equals(pw)) {
						check = true;
						System.out.println("로그인 성공");
						System.out.println(user.getName() + "님 환영합니다");
						break;
					}
				}*/
				
				for(int i = 0; i < users.length; i++) {
					if(users[i] == null) break;
					if(users[i].getId().equals(id) && users[i].getPw().equals(pw)) {
						check = true;
						System.out.println("로그인 성공");
						System.out.println(users[i].getName() + "님 환영합니다");
						break;
					}
				}
				
				// 로그인 실패 여부 확인
				if(check == false) {
					System.out.println("아이디 또는 비밀번호를 확인해주세요");
				}
				break;
			case 3:
				System.out.println("프로그램을 종료합니다");
				whileNum = 1; 
				break;
			default:
				System.out.println("잘못 입력했습니다");
				
				
			}//switch
		}//while

		
		
	}

	
	
	
	
	
}
