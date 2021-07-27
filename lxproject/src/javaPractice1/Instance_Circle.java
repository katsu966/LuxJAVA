package javaPractice1;

public class Instance_Circle {
	int radius; // 원의 반지름 필드
	String name; // 원의 이름 필드
	
	public Instance_Circle(){} // 생성자
	
	public double getArea() { // 원 면적 계산 메소드
		return 3.14*radius*radius;}
	public static void main(String[] args) {
		Instance_Circle pizza; // 레퍼런스 변수 pizza 선언
		pizza = new Instance_Circle(); // Circle 객체 생성
		pizza.radius = 10; // 피자의 반지름 10설정
		pizza.name = "자바피자"; // 피자의 이름 설정
		double area = pizza.getArea(); // 피자의 면적 알아내기
		System.out.println(pizza.name + "의 면적은 " + area);
		
	}
	}

