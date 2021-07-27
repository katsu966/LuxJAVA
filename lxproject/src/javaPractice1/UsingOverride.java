package javaPractice1;

class Shape1 { // ���� Ŭ����
	public Shape1 next;
	public Shape1() { next = null;}
	
	public void draw() {
		System.out.println("Shape");
	}
}

class Line1 extends Shape1{
	public void draw() { // �޼ҵ� �������̵�
		System.out.println("Line");
	}
}
class Rect1 extends Shape1{
	public void draw() { // �޼ҵ� �������̵�
		System.out.println("Rect");
	}
}
class Circle1 extends Shape1 {
	public void draw() { // �޼ҵ� �������̵�
		System.out.println("Circle");
	}
}

public class UsingOverride {
	public static void main(String[] args) {
		Shape1 start, last, obj;
	
	// ��ũ�� ����Ʈ�� ���� �����Ͽ� ����
	start = new Line1(); // Line ��ü ���� 
	last = start;
	obj = new Rect1(); // Rect ��ü ����
	last.next = obj;
	obj = new Line1(); // Line ��ü ����
	last.next = obj;
	obj = new Circle1(); // Circle ��ü ����
	last.next = obj;
	
	// ��� ���� ���
	Shape1 p = start;
	while(p != null) {
		p.draw();
		p = p.next;
	}
}
}
