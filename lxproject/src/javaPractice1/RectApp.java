package javaPractice1;

import java.util.Scanner;

class Rectangle {
	int width, height;

	public int getArea() {
		return width * height;
	}
}

public class RectApp {
	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		Scanner sc = new Scanner(System.in);
		System.out.print(">>");
		rect.width=sc.nextInt();
		rect.height=sc.nextInt();
		System.out.println("�簢���Ǹ����� "+rect.getArea());

		sc.close();
	}
}
