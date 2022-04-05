package day13;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;						//import 되면 뜻이 사용하는 방식이 달라진다.

public class MainClass01 {

	public static void main(String[] args) {
		
		// int 형태와 비슷하다
		long time = System.currentTimeMillis();			//현재시간을 초단위로 가져오는거  //몇초가 지났나 이런거 연산할떄 사용				
		System.out.println(time);																						// 1649119644601
		
		SimpleDateFormat simple = new SimpleDateFormat("yyyy년 MM월-dd일- hh시 mm분 ss초 이다"); //현재 날짜를 사용하려면 	
		
		String s = simple.format(time);
		System.out.println(s);																		// 2022년 04월-05일- 09시 47분 24초 이다
			
		Date date = new Date();
		System.out.println(date);							// Tue Apr 05 09:47:24 KST 2022				
		System.out.println(simple.format(date));			// 2022년 04월-05일- 09시 47분 24초 이다
		
		for(int i = 0; i<5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);							// //static으로 만들어졌다(class 이름으로 접근가능)			// Thread.sleep 사용시  try catch 사용
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}			
			
		}
		String ss = "calc";
		ProcessBuilder pb = new ProcessBuilder(ss);															// ProcessBuilder 사용시  try catch 사용
		try {
			pb.start();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}

