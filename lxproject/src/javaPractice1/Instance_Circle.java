package javaPractice1;

public class Instance_Circle {
	int radius; // ���� ������ �ʵ�
	String name; // ���� �̸� �ʵ�
	
	public Instance_Circle(){} // ������
	
	public double getArea() { // �� ���� ��� �޼ҵ�
		return 3.14*radius*radius;}
	public static void main(String[] args) {
		Instance_Circle pizza; // ���۷��� ���� pizza ����
		pizza = new Instance_Circle(); // Circle ��ü ����
		pizza.radius = 10; // ������ ������ 10����
		pizza.name = "�ڹ�����"; // ������ �̸� ����
		double area = pizza.getArea(); // ������ ���� �˾Ƴ���
		System.out.println(pizza.name + "�� ������ " + area);
		
	}
	}

