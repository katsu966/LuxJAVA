package javaPracticeTest1;

import java.util.Scanner;

public class C3_Test3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = 0;
	
	System.out.print("정수를 입력하시오 >>");
	
	n = sc.nextInt();
	
	for(int i=0; i<n; i++) {
		for(int j=0; j<n-i; j++) {
			System.out.print("*"); 
			} System.out.println(); 
			}
sc.close();
}
}