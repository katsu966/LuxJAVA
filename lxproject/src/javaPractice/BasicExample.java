package src.javaPractice;

public class BasicExample { 
	
	public static int sum(int n, int m){ //�Ű����� n, m 
		return n + m;// n�� m�� �� ����
	}

	
	public static void main(String[] arg) {
		/*
		 * �޼ҵ�(�Լ�)�� main()�� �ݵ�� public static void Ÿ������ �����ؾ��ϸ� �� Ŭ������ 2���̻��� main()�� �ۼ��ϸ� �ȵȴ�.
		 * main �޼ҵ�� �ڹ� ���ø����̼� ����� ���ϸ��� �����ϸ� ��� ��ü������ �����Ҽ� ������ �ڹٰ� ������ �Ǵ� ���� ���ǵǴ� �����ִ� ���̾��� �Լ�
		 * String[] = �������� ���ڿ� �����Ͱ� ���� �������(�迭), arg�� �ܼ� ������ �ٸ��� �����ص� �������
		 */
		
		// ��������: �޼ҵ� �������� ����Ǿ� ���Ǵ� ����
		int i = 20; // ���� i�� ����� ���ÿ� 20���� �ʱ�ȭ
		int s; // ������Ÿ��(�ڷ���) ����; 
		char a;
		
		s = sum(i, 10); // �޼ҵ� ȣ��
		a = '?';
		
		//System.out.print�� ȭ�� ����� �ϱ����� ������ ln�� ���̸� ����� ���������� �Ѿ��.
		System.out.println(a);
		System.out.println("Hello");
		System.out.println(s);
  }
}

