package javaPractice1;

public class StarPrint2 {
	public static void main(String[] args) {
		for (int a = 1; a < 5; a++) {// �� 4���ݺ�
			for (int b = 0; b < a; b++) {// b�� a���� ������������ * �ݺ� 
				System.out.print("*");
			}System.out.println();
		}
	}
}
