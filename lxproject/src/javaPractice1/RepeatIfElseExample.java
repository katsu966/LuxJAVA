package javaPractice1;

import java.util.Scanner;

public class RepeatIfElseExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Scanner�� scanner�� �ν��Ͻ�ȭ

		System.out.println("������ �Է����ּ���");
		int score = scanner.nextInt(); // score���� ������ Ÿ�� ������ ����, ���� ������ �Է�

		System.out.println("�г��� �Է����ּ���");
		int year = scanner.nextInt(); // year ���� ������Ÿ�� ������ ����, ���� ������ �Է�

		if (score >= 60) {// 60���̻��ϰ��
			if (year != 4) // 4�г� �ƴϸ�
				System.out.println("�հ�");
			else if (score >= 70)// 4�г��̸�
				System.out.println("�հ�");
			else // 4�г��� �ƴϰ� 70�� �̸��̸�
				System.out.println("���հ�");
		} else // 4�г��̰� 60�� �̸��̸�
			System.out.println("���հ�");

		scanner.close();

	}

}
