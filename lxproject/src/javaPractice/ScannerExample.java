package src.javaPractice;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�̸�, ����, ����, ü��, ���� ���θ� ��ĭ���� �и��Ͽ� �Է��ϼ���");
		/*
		 * next()�� �������� �Էµ� ���ڿ� ����
		 * nextLine()�� ������ �� ���ڿ��� ������ ����, ���ͷ� ����
		 */
		
		String name = scanner.next();
		System.out.print("�̸��� " +  name  + ", ");
		
		String city = scanner.next();
		System.out.print("���ô� " + city + ", ");
		
		int age = scanner.nextInt();
		System.out.print("���̴� " + age + "��, ");
		
		double weight = scanner.nextDouble();
		System.out.print("ü���� "+ weight + "kg, ");
		
		boolean isSingle = scanner.nextBoolean();
		System.out.println("���� ���δ� " + isSingle + "�Դϴ�. ");
		
		scanner.close();
		
	}

}
