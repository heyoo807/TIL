package game;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Animal avatar = null;
		System.out.println("**모여라 동물 친구들**");
		
		while(true) {
			System.out.println("--캐릭터 선택--");
			System.out.println("1. 강아지");
			System.out.println("2. 고양이");
			System.out.println("3. 도마뱀");
			int choice = Integer.parseInt(sc.nextLine());
			
			if(choice != 1 && choice != 2 && choice != 3) {
				System.out.println("알맞은 캐릭터를 선택하시오");
				continue; // 다시 while문으로 돌아감
			}
			
			System.out.println("--캐릭터 이름 입력란--\n캐릭터 이름:   ");
			String name = sc.nextLine();
			
			if(choice == 1) {
				avatar = new Dog(name, 50, 50);
			}else if(choice == 2) {
				avatar = new Cat(name, 100, 15);
			}else if(choice == 3) {
				avatar = new Lizard(name, 30, 30);
			}
			
			break;
		}
		
		while(true) {
			System.out.println("1. 먹이주기");
			System.out.println("2. 산책하기");
			System.out.println("3. 놀아주기");
			System.out.println("4. 나가기");
			System.out.println("입력 >> ");
			int choice = Integer.parseInt(sc.nextLine());
			
			if(choice == 1) {
				avatar.eat();
			}else if(choice == 2) {
				avatar.walk();
			}else if(choice == 3) {
				avatar.play();
			}else if(choice == 4) {
				System.out.println("게임을 종료");
				if(avatar instanceof Cat) {
					((Cat)avatar).onlyCat(); // 다운캐스팅하여 Cat클래스 멤버에 접근
				}
				break;
			}else {
				System.out.println("재입력");
				break;
			}
		}
	}
}
