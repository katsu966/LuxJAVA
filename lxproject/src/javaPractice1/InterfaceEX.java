package javaPractice1;
interface PhoneInterface{ // 인터페이스 선언
	final int TIMEOUT = 10000; // 상수 필드 선언
	void sendCall(); // 추상 메소드
	void receiveCall(); // 추상 메소드
	default void printLogo() { // default 메소드
		System.out.println("**Phone**");
	}
	
}
class SamsungPhone implements PhoneInterface{
	// PhoneInterface의 모든 메소드 구현
	@Override
	public void sendCall() {
		System.out.println("RRRRR");
	}	
	@Override
	public void receiveCall() {
		System.out.println("전화왔숑");
}
	
	// 메소드 추가작성
	public void flash() {System.out.println("전화기에 불이 켜졌습니다.");
}
}
public class InterfaceEX {
	public static void main(String[] args) {
		SamsungPhone phone = new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
	}
}
