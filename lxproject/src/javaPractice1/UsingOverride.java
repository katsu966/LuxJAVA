package javaPractice1;

class Shape1 { // 슈퍼 클래스
	public Shape1 next;
	public Shape1() { next = null;}
	
	public void draw() {
		System.out.println("Shape");
	}
}

class Line1 extends Shape1{
	public void draw() { // 메소드 오버라이딩
		System.out.println("Line");
	}
}
class Rect1 extends Shape1{
	public void draw() { // 메소드 오버라이딩
		System.out.println("Rect");
	}
}
class Circle1 extends Shape1 {
	public void draw() { // 메소드 오버라이딩
		System.out.println("Circle");
	}
}

public class UsingOverride {
	public static void main(String[] args) {
		Shape1 start, last, obj;
	
	// 링크드 리스트로 도형 생성하여 연결
	start = new Line1(); // Line 객체 연결 
	last = start;
	obj = new Rect1(); // Rect 객체 연결
	last.next = obj;
	obj = new Line1(); // Line 객체 연결
	last.next = obj;
	obj = new Circle1(); // Circle 객체 연결
	last.next = obj;
	
	// 모든 도형 출력
	Shape1 p = start;
	while(p != null) {
		p.draw();
		p = p.next;
	}
}
}
