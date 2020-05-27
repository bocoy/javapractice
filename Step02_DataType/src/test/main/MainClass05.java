package test.main;

public class MainClass05 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		
		// "김구라" 정보를 담고 있는 참도값(id값) 이 변수에 들어간다.
		String name = "김구라";
		String tmp = name; 	//참조값 복샤해 주기
		name = "원숭이";	//새로운 참조값으로 대입하기
		name = null; //name 변수를 empty(빈) 상태로 만들기
	}
}
