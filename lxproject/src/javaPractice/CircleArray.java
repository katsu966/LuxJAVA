package src.javaPractice;

class CircleArray2 {
	int radius;
	public CircleArray2(int radius) {
		this.radius = radius;
	}
public double getArea(){
	return 3.14*radius*radius;
}
}

public class CircleArray{
	public static void main(String[] args) {
		CircleArray2[] c; // Circle �迭�� ���� ���۷��� c ����
		c = new CircleArray2[5]; // 5���� ���۷��� �迭 ����
		
		for(int i=0; i<c.length; i++) // �迭�� ������ŭ
			c[i] = new CircleArray2(i); // i��° ���� ��ü ����
		
		for(int i=0; i<c.length; i++) 
			System.out.println((int)c[i].getArea() + " ");
		
			
		
	}
}