package src.javaPractice;

public class ReturnArrayExample {
	static int[] makeArray() {  // ������ �迭�� �����ϴ� �޼ҵ�
		int temp[] = new int[4];
		for (int i = 0; i < temp.length; i++) 
			temp[i] = i; // �迭�� ���Ҹ� 1, 2, 3, 4�� �ʱ�ȭ
		
		return temp; // �迭 ����

	}

	public static void main(String[] args) {
		int intArray[]; // �迭 ���۷��� ���� ����
		intArray = makeArray(); // �� �޼ҵ�� ���� �迭 ���� ����
		for(int i=0; i<intArray.length; i++)
			System.out.print(intArray[i] + " "); // �迭 ��� ���� ���
}
}