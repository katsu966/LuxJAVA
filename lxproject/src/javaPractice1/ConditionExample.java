package javaPractice1;

import java.util.Scanner;

public class ConditionExample {
	public static void main(String[] args) {
		// if���� ���ǽ��� true�� if (���� ����) ���� false �� if�� �����.
		// 80�� �̻��̸� �հ� �׷��� ������ ���հ��� if-else��
		Scanner scanner = new Scanner(System.in);

		System.out.println("������ �Է��Ͻÿ�: ");
		int score = scanner.nextInt();
		if (score >= 80)
			System.out.println("�����մϴ�! �հ��Դϴ�");
		else
			System.out.println("���հ��Դϴ�");

		scanner.close();
	}

}
