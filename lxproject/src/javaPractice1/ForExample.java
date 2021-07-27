package javaPractice1;

public class ForExample {
	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1; i <= 10; i++) {// 1~10까지 반복
			sum += i;
			System.out.print(i); // 더하는 수 출력
			if (i <= 9) { //숫자가 출력될때마다 + 출력
				System.out.print("+");
			} else {
				System.out.print("=");
				System.out.print(sum);
			}
		}
	}

}
