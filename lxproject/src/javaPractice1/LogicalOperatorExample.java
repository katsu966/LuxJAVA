package javaPractice1;

public class LogicalOperatorExample {
	public static void main(String[] args) {
		/*
		 * ������ �� ������
		 * !a = NOT ����, a�� true�� false, false�� true  
		 * a || b = a�� b�� OR����, a�� b ��� false�� ��쿡�� false(��, �����ϳ� ���̸� ��)
		 * a && b  = a�� b�� AND����, a�� b��� true�� ��쿡�� true
		 */
	// �񱳿���
	System.out.println('a' > 'b'); // a�� b���� ū�� ������ �˼� ���� ������ false
	System.out.println(3 >= 2); // t
	System.out.println(-1 < 0); // t
	System.out.println(3.45 <= 2);// f
	System.out.println(3 == 2); // f
	System.out.println(3 != 2); // t
	System.out.println(!(3 != 2)); // f
	
	// �� ����� �� ������ ����
	System.out.println((3 > 2) && (-1 > 0));
	System.out.println((3 != 2) || (-1 > 0));
	}

}
