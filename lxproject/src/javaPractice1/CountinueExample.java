package javaPractice1;

import java.util.Scanner;

public class CountinueExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 5개를 입력하세요");
		int sum = 0;
		for (int i = 1; i < 6; i++) {
			int n = sc.nextInt(); // 정수 입력
			if (n <= 0) {
				continue; // 양수가 아닌 경우 다시 반복문 진행
			} else {
				sum += n; // 양수인 경우 덧셈
			}
		}
		System.out.println("양수의 합은 " + sum);
		sc.close();
	}
}