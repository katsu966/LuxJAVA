package src.javaPractice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputException {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("���� 3���� �Է��ϼ���");
	
	int sum=0, n=0;
	for(int i=0; i<3; i++) {
		System.out.print(i+">>");
		try {
			n = sc.nextInt(); // ���� �Է�
		}
		catch(InputMismatchException e){
		System.out.println("������ �ƴմϴ� �ٽ� �Է��ϼ���");
		sc.nextInt(); // ���� �Է� ��Ʈ���� �����ִ� ��ū�� �����.
		i--; // �ε����� �������� �ʵ��� �̸� ����
		continue; // ���� ����
		}
		sum += n;// ���ϱ�
}
	System.out.println("����" + sum);
	sc.close();
}
}
