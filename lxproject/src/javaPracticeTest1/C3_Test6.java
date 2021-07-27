package javaPracticeTest1;

import java.util.Scanner;

public class C3_Test6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int unit[] = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		System.out.print("금액을 입력하시오");
		int n = sc.nextInt();
		for(int i=0; i<unit.length; i++) {
			System.out.println(unit[i]+ "원짜리" + ":" + (n/unit[i])+ "개");
			n = n - unit[i]*(n/unit[i]);
			
		}
	}

}
