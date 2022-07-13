package class_;

public class Student { // 필드
	String name; //멤버, 멤버변수, 인스턴스변수
	int kor; //멤버, 멤버변수, 인스턴스변수
	int eng;//멤버, 멤버변수, 인스턴스변수
	int math;//멤버, 멤버변수, 인스턴스변수
	
	public Student() {
		// 기본생성자
	}
	
	public Student(String name, int kor, int eng, int math) {
		// 초기화 생성자
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	//멤버, 멤버 함수 , 메소드
	public void show() {
		System.out.println("--학생 정보--");
		System.out.println("이름 : " + this.name);
		System.out.println("국어점수 : " + this.kor);
		System.out.println("영어점수 : " + this.eng);
		System.out.println("수학점수 : " + this.math);
		
	}
	
	
	
}
