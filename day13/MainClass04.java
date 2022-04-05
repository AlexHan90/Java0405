package day13;

class AAA{
	public AAA() {
		System.out.println("생성자 실행");				//생성자를 만들때에는 무조건 디폴트 생성자를 만들어줘야 에러가 안난다. ex) public AAA() { } , public AAA(String s) {}
	}
	public AAA(String s) {
		System.out.println(s+ ":생성자 실행 ");
	}
		void test() {
			System.out.println("test");
	}
	
	
	}

/* 
 							<<<<<<<<생성자>>>>>>> 
  - 반환타입은 없으며 클래스 이름과 동일하게 만든다
  - 초기화 목적으로 만들어 사용한다
  - 객체 생성시 자동으로 호출 된다
 */
	

public class MainClass04 {
	public static void main(String[] args) {
		AAA a = new AAA();
		AAA aa = new AAA("초기화 진행");
		
		
		
		
		
		
		
		
	}

}

