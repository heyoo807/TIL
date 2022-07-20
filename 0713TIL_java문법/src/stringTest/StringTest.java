package stringTest;

public class StringTest {
	public static void main(String[] args) {
		String str1 = "apple juice is delicious";
		
		String[] ar = {"안녕", "하세요", "반갑습니다"};
		
		//join() : static 메소드
		System.out.println(String.join(" ", ar)); // 안녕 하세요 반갑습니다
		
		String[] temp = str1.split(" "); //split()메소드의 리턴타입은 배열
		
		for(int i = 0; i < temp.length; i++){
			System.out.println(temp[i]); // apple // juice //is //delicious
		}
		
		System.out.println("--------------------");
		
		System.out.println(str1.substring(12, 15)); // 문자열의 12번째글자부터15번째글자까지 자르겠다 //is
		System.out.println(str1.substring(12)); // 12번부터 끝까지 자르겠다 //is delicious
		
		System.out.println(str1.length()); //24
		
		for(int i = 0; i < str1.length(); i++) {
			System.out.print(str1.charAt(i)); //apple juice is delicious
			if(i == str1.length()-1) System.out.println();
		}
		
	
		// indexOf() : 매개변수로 받은 문자열(문자)이 문자열객체에 위치한 인덱스번호를 리턴
		System.out.println(str1.indexOf('e'));
		System.out.println(str1.indexOf('e', 5));
		System.out.println(str1.indexOf("안녕")); //없을경우 -1리턴
		
		
	}
}
