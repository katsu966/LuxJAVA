package src.javaPractice;
import java.util.Scanner;
public class BreakExample {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("exit를 입력하면 종료됩니다.");
	while(true) {
		System.out.println(">>");
		String text = sc. nextLine(); // 한 라인 읽기(공백 쳐도 입력됨)ㄷㅇ
		if(text.equals("exit")) {
			break;//while 문을 벗어남
		}
	}System.out.println("종료합니다");
	sc.close();
}
}
