package day13;

import java.util.Scanner;

public class MainClass03 {

	public static void main(String[] args) {
	
		//Try catch = 예외처리 > 프로그램에 예외가(문제) 발생됐을떄 처리하는방법	/ 나의 의도와는 달리 프로그램이 실행될때, 예외처리안하면 프로그램이 바로 종료, 어떠한 문제가 발생될 소지가 있으면 예외처리 사용~~~
	int age;
	Scanner input = new Scanner(System.in);
	
	System.out.print("나이 입력 : ");
	try {
	age = input.nextInt();
	System.out.println("당신의 나이는 " + age);					// 예외처리 사용하면 프로그램 종료를 막을수있고 이상문구 텍스트로 전달!(빨간색으로 제발 숫자만 입력하세요~~~)
	} catch (Exception e) {
		System.err.println("제발 숫자만 입력하세요~~~~");
	}
	System.out.println("다음 문장들 실행!!");
	System.out.println("다음 문장들 실행!!");
	System.out.println("다음 문장들 실행!!");
	System.out.println("다음 문장들 실행!!");
	System.out.println("다음 문장들 실행!!");
		
	}

}
