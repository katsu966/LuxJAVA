package javaPractice1;

import java.util.Scanner;

public class WhileExample {
	public static void main(String[] args) {
	int count=0; // �ԷµǴ� ������ ����
	int sum=0; // ��
		 
	Scanner sc = new Scanner(System.in);
	
	System.out.println("������ �Է��ϰ� �������� -1�� �Է��ϼ���");
	
	int n = sc.nextInt();
	
	while(n != -1) { // -1�ԷµǸ� while ���� ���
		sum += n;
		count++;
		n = sc.nextInt();
	}
	if(count == 0) {
		System.out.println("�Էµ� ���� �����ϴ�.");
	}
	else {
		System.out.println("������ ������" + count +"���̸�");
		System.out.println("�����" + (double)sum/count + "�Դϴ�");
	}
	sc.close();
}
}
