package src.javaPractice;
import java.util.Scanner;
public class BreakExample {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("exit�� �Է��ϸ� ����˴ϴ�.");
	while(true) {
		System.out.println(">>");
		String text = sc. nextLine(); // �� ���� �б�(���� �ĵ� �Էµ�)����
		if(text.equals("exit")) {
			break;//while ���� ���
		}
	}System.out.println("�����մϴ�");
	sc.close();
}
}
