package javaPractice1;

public class Constructor_Circle {
int radius;
String name;
public Constructor_Circle() {// 생성자의 이름은 클래스 이름과 동일, 매개 변수 없는 생성자
	radius = 1; name = "";// 필드 초기화 
}

public Constructor_Circle(int r, String n) {// 생성자는 리턴타입이 없음, 매개 변수를 가진 생성자
	radius = r; name = n; // 매개 변수로 필드 초기화, 생성자는 radius와 name 필드 초기화
}

public double getArea() {
	return 3.14*radius*radius;
}

public static void main(String[] args) {
	Constructor_Circle pizza = new Constructor_Circle(10, "자바피자");
	// 객채생성, 반지름을 10, 이름을 "자바피자" 로 초기화
	
	double area = pizza.getArea();
	System.out.println(pizza.name+"의 면적은 " + area);
	
	Constructor_Circle donut = new Constructor_Circle(); // 객체생성, 반지름을 1 이름을""로 초기화
	donut.name = "도넛피자"; // 이름변경
	area = donut.getArea();
	System.out.println(donut.name + "의 면적은" + area);
}
}
