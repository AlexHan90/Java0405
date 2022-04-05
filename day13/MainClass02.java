package day13;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class MainClass02 {

	public static void main(String[] args) {
		HashMap map = new HashMap();				//해당하는 키를통해서 값을 가져오는게 map!!!! 해당하는  key 입력하면 value 나옴
		map.put("계산기", "calc");
		map.put("메모장", "notepad");
		
		
		
		Scanner input = new Scanner(System.in);
		String key;
		System.out.println("실행 값 입력 : ");
		key = input.next();
		
		System.out.println(key+" : "+map.get(key));					//"calc" 출력
		System.out.println(map.containsKey(key));					//contains > 없는 key 입력시 false 나온다.
		
		if(map.containsKey(key) == true) { // map.get() != null				
			ProcessBuilder pb = new ProcessBuilder((String)map.get(key));
			try {
				pb.start();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}else {
			System.out.println(key+"명령어는 존재하지 않음!!!");
	}

}
}
