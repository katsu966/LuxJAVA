package javaPracticeTest1;

import java.util.Scanner;

public class C3_Test5_2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int s[] = new int[10];
	System.out.print("���� ���� 10���� �Է��Ͻÿ�>>");

	for(int i=0; i<s.length; i++) {
	 s[i] = sc.nextInt();
	} 
	 System.out.print("3�� �����");
	 for(int j=0; j<s.length; j++) {
		 if(s[j]%3 == 0)
			 System.out.print(s[j]+" ");
	}
}
}
