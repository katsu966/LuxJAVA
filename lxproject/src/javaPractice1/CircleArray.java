package javaPractice1;

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
		CircleArray2[] c; // Circle 배열에 대한 레퍼런스 c 선언
		c = new CircleArray2[5]; // 5개의 레퍼런스 배열 생성
		
		for(int i=0; i<c.length; i++) // 배열의 개수만큼
			c[i] = new CircleArray2(i); // i번째 원소 객체 생성
		
		for(int i=0; i<c.length; i++) 
			System.out.println((int)c[i].getArea() + " ");
		
			
		
	}
}