package src.javaPractice;

import java.util.Scanner;

public class DevideByZeroHandling {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("�������� �Է½ÿ� : ");
			int divided =sc.nextInt();
			System.out.print("�������� �Է��Ͻÿ� : ");
			int divisor =sc.nextInt();
			try {
				System.out.println(divided+ "��" + divisor + "�� ������ ����" + divided/divisor +"�Դϴ�" );
				break;
				}
			catch(ArithmeticException e) {// ArithmeticException ���� ó�� �ڵ�
				System.out.println("0���� ���� �� �����ϴ�! �ٽ� �Է��ϼ���");
			}
		}
		sc.close();
	}

}
