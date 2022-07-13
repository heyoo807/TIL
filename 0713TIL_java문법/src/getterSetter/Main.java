package getterSetter;

public class Main {
	public static void main(String[] args) {
		Student std1 = new Student("김사과", 100, 100, 100);
		Student std2 = new Student("반하나", 90, 90, 90);
		std1.show();
		System.out.println();
		std2.show();
		
		//setter : private 변수에 값을 저장해주는 메소드
		std1.setKor(90);
		std1.setEng(90);
		std1.setMath(90);
		
		std2.setKor(100);
		std2.setEng(100);
		std2.setMath(100);
		
		std1.show();
		std2.show();

		// getter : private 변수에 저장되어있는 값을 return해주는 메소드
		
		// 객체타입배열
		Student[] students = {
				new Student("반하나", 100, 100, 100),
				new Student("김사과", 90, 90, 90),
				new Student("이메론", 80, 80, 80)
		};
		
		System.out.println(students[0].getName());
		System.out.println(students[1].getName());
		System.out.println(students[2].getName());
		
		

	}
}
