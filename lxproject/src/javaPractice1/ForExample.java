package javaPractice1;

public class ForExample {
	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1; i <= 10; i++) {// 1~10���� �ݺ�
			sum += i;
			System.out.print(i); // ���ϴ� �� ���
			if (i <= 9) { //���ڰ� ��µɶ����� + ���
				System.out.print("+");
			} else {
				System.out.print("=");
				System.out.print(sum);
			}
		}
	}

}
