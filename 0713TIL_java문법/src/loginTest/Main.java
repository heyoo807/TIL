package loginTest;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		User[] users = new User[3];
		int whileNum = 0;
		//User Ŭ���� Ÿ���� �迭 users �ʱ�ȭ , 3�� ��,  UserŸ�� ��ü�� users �迭 �� ��ҷ�
		
		//�α��� ȸ������ ��� �����ϱ�
		while(whileNum == 0) {
			System.out.println("1. ȸ������");
			System.out.println("2. �α���");
			System.out.println("3. ������");
			int choice = Integer.parseInt(sc.nextLine());

			switch(choice) {
			case 1:
				User u = new User();
				System.out.println("�̸�: ");
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
				// �α����� �����ϸ� ���̵� �Ǵ� ��й�ȣ�� �ٽ� Ȯ�����ּ��� ����ϱ�
				
				boolean check = false; // flag����
				
				//���� for��
/*				for(User user: users) {
					if(user == null) break;
					
					if(user.getId().equals(id) && user.getPw().equals(pw)) {
						check = true;
						System.out.println("�α��� ����");
						System.out.println(user.getName() + "�� ȯ���մϴ�");
						break;
					}
				}*/
				
				for(int i = 0; i < users.length; i++) {
					if(users[i] == null) break;
					if(users[i].getId().equals(id) && users[i].getPw().equals(pw)) {
						check = true;
						System.out.println("�α��� ����");
						System.out.println(users[i].getName() + "�� ȯ���մϴ�");
						break;
					}
				}
				
				// �α��� ���� ���� Ȯ��
				if(check == false) {
					System.out.println("���̵� �Ǵ� ��й�ȣ�� Ȯ�����ּ���");
				}
				break;
			case 3:
				System.out.println("���α׷��� �����մϴ�");
				whileNum = 1; 
				break;
			default:
				System.out.println("�߸� �Է��߽��ϴ�");
				
				
			}//switch
		}//while

		
		
	}

	
	
	
	
	
}
