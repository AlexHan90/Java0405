package test;

import test2.Test01;
import test2.Test02;
// import test2.*; (테스트2 패키지에 모든것을 사용하겠다)
//다른 패키지라면 import가 무조건 필요함 ex)test2 패키지에  test02 사용할것이다

public class MainClass {

	public static void main(String[] args) {
		
	MainClass01 m = new MainClass01();
		m.test();   // class에서 public() 키워드 삭제시 디폴트! 같은 폴더에 있을때는 생략 가능
					// 디폴트는 같은 패키지안에서만 접근가능
	

							// 패키지 = 폴더(기능들을 모아놓은것) 
							//패키지 이름지을떄 규칙 ex) com.naver.pr

		
		Test01 t = new Test01();
		t.test();
		Test02 t02 = new Test02();
		t02.test();
	}

}
