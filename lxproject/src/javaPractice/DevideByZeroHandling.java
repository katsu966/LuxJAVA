package src.javaPractice;

import java.util.Scanner;

public class DevideByZeroHandling {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("나뉨수를 입력시오 : ");
			int divided =sc.nextInt();
			System.out.print("나눗수를 입력하시오 : ");
			int divisor =sc.nextInt();
			try {
				System.out.println(divided+ "를" + divisor + "로 나무면 몫은" + divided/divisor +"입니다" );
				break;
				}
			catch(ArithmeticException e) {// ArithmeticException 예외 처리 코드
				System.out.println("0으로 나눌 수 없습니다! 다시 입력하세요");
			}
		}
		sc.close();
	}

}
