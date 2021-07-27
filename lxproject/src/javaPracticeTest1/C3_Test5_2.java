package javaPracticeTest1;

import java.util.Scanner;

public class C3_Test5_2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int s[] = new int[10];
	System.out.print("양의 정수 10개를 입력하시오>>");

	for(int i=0; i<s.length; i++) {
	 s[i] = sc.nextInt();
	} 
	 System.out.print("3의 배수는");
	 for(int j=0; j<s.length; j++) {
		 if(s[j]%3 == 0)
			 System.out.print(s[j]+" ");
	}
}
}
