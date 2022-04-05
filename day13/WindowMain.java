package day13;

import java.util.HashMap;

public class WindowMain {
			public static void main(String[] args){
				HashMap map = new HashMap();
				map.put("계산기", "calc.exe");
				map.put("메모장", "notepad.exe");
				Win7Quiz win7 = new Win7Quiz(map);
				win7.display();
			}
	
}
