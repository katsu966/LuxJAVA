package src.javaPractice;

public class StarPrint3 {
	public static void main(String[] args) {
		for (int a = 1; a < 5; a++) {//�� 4�� �ݺ�
			for (int b = 4; b > 0; b--) {// 4ĭ ���� 
				if (a < b) {// b�� a���� Ŭ�������� ����
					System.out.print(" ");
				} else {//b�� a�� ���ų� �۾����� ���� *
					System.out.print("*");
				}

			}
			System.out.println();
		}
	}
}
