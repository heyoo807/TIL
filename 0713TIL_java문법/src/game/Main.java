package game;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Animal avatar = null;
		System.out.println("**�𿩶� ���� ģ����**");
		
		while(true) {
			System.out.println("--ĳ���� ����--");
			System.out.println("1. ������");
			System.out.println("2. �����");
			System.out.println("3. ������");
			int choice = Integer.parseInt(sc.nextLine());
			
			if(choice != 1 && choice != 2 && choice != 3) {
				System.out.println("�˸��� ĳ���͸� �����Ͻÿ�");
				continue; // �ٽ� while������ ���ư�
			}
			
			System.out.println("--ĳ���� �̸� �Է¶�--\nĳ���� �̸�:   ");
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
			System.out.println("1. �����ֱ�");
			System.out.println("2. ��å�ϱ�");
			System.out.println("3. ����ֱ�");
			System.out.println("4. ������");
			System.out.println("�Է� >> ");
			int choice = Integer.parseInt(sc.nextLine());
			
			if(choice == 1) {
				avatar.eat();
			}else if(choice == 2) {
				avatar.walk();
			}else if(choice == 3) {
				avatar.play();
			}else if(choice == 4) {
				System.out.println("������ ����");
				if(avatar instanceof Cat) {
					((Cat)avatar).onlyCat(); // �ٿ�ĳ�����Ͽ� CatŬ���� ����� ����
				}
				break;
			}else {
				System.out.println("���Է�");
				break;
			}
		}
	}
}
