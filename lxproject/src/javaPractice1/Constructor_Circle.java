package javaPractice1;

public class Constructor_Circle {
int radius;
String name;
public Constructor_Circle() {// �������� �̸��� Ŭ���� �̸��� ����, �Ű� ���� ���� ������
	radius = 1; name = "";// �ʵ� �ʱ�ȭ 
}

public Constructor_Circle(int r, String n) {// �����ڴ� ����Ÿ���� ����, �Ű� ������ ���� ������
	radius = r; name = n; // �Ű� ������ �ʵ� �ʱ�ȭ, �����ڴ� radius�� name �ʵ� �ʱ�ȭ
}

public double getArea() {
	return 3.14*radius*radius;
}

public static void main(String[] args) {
	Constructor_Circle pizza = new Constructor_Circle(10, "�ڹ�����");
	// ��ä����, �������� 10, �̸��� "�ڹ�����" �� �ʱ�ȭ
	
	double area = pizza.getArea();
	System.out.println(pizza.name+"�� ������ " + area);
	
	Constructor_Circle donut = new Constructor_Circle(); // ��ü����, �������� 1 �̸���""�� �ʱ�ȭ
	donut.name = "��������"; // �̸�����
	area = donut.getArea();
	System.out.println(donut.name + "�� ������" + area);
}
}
