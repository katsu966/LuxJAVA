package javaPractice1;

import java.util.Scanner;

public class CountinueExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("���� 5���� �Է��ϼ���");
		int sum = 0;
		for (int i = 1; i < 6; i++) {
			int n = sc.nextInt(); // ���� �Է�
			if (n <= 0) {
				continue; // ����� �ƴ� ��� �ٽ� �ݺ��� ����
			} else {
				sum += n; // ����� ��� ����
			}
		}
		System.out.println("����� ���� " + sum);
		sc.close();
	}
}