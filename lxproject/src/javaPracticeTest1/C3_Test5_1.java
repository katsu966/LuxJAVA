package javaPracticeTest1;

import java.util.Scanner;

public class C3_Test5_1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("���� ���� 10���� �Է��Ͻÿ�>>");
	
	for(int i=0; i<10; i++) {
		int s = sc.nextInt();		
		if(s%3==0)
			System.out.print(s + " ");
}	sc.close();
}
}
