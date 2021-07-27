package javaPractice1;

import java.util.Scanner;

public class RepeatIfElseExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Scanner를 scanner로 인스턴스화

		System.out.println("점수를 입력해주세요");
		int score = scanner.nextInt(); // score변수 데이터 타입 정수형 선언, 공백 가능한 입력

		System.out.println("학년을 입력해주세요");
		int year = scanner.nextInt(); // year 변수 데이터타입 정수형 선언, 공백 가능한 입력

		if (score >= 60) {// 60점이상일경우
			if (year != 4) // 4학년 아니면
				System.out.println("합격");
			else if (score >= 70)// 4학년이면
				System.out.println("합격");
			else // 4학년이 아니고 70점 미만이면
				System.out.println("불합격");
		} else // 4학년이고 60점 미만이면
			System.out.println("불합격");

		scanner.close();

	}

}
