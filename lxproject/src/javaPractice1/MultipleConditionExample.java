package javaPractice1;

import java.util.Scanner;

public class MultipleConditionExample {
	public static void main(String[] args) {
		char grade;
		System.out.println("������ �Է��ϼ���");

		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();

		if (score >= 90)
			grade = 'A';
		else if (score >= 80)
			grade = 'B';
		else if (score >= 70)
			grade = 'C';
		else if (score >= 60)
			grade = 'D';
		else
			grade = 'F';

		System.out.println("������ " + grade + "�Դϴ�.");

		scanner.close();

	}

}
