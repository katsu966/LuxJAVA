package javaPractice1;

public class StarPrint4 {
	public static void main(String[] args) {
		for (int i = 5; i > 0; i--) {// ��ø������ ���踦 ����� �� 5�� �ݺ�
			for (int j = 0; j < i; j++) { //j�� i���� ������ ���� * �ݺ� 
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
