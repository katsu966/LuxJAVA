package javaPractice1;

import java.util.Scanner;

public class ConditionExample {
	public static void main(String[] args) {
		// if문의 조건식이 true면 if (내부 문장) 실행 false 면 if문 벗어난다.
		// 80점 이상이면 합격 그렇지 않으면 불합격인 if-else문
		Scanner scanner = new Scanner(System.in);

		System.out.println("점수를 입력하시오: ");
		int score = scanner.nextInt();
		if (score >= 80)
			System.out.println("축하합니다! 합격입니다");
		else
			System.out.println("불합격입니다");

		scanner.close();
	}

}
