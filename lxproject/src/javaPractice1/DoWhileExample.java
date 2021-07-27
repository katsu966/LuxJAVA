package javaPractice1;

public class DoWhileExample {
	public static void main(String[] args) {
		char c = 'a';

		do {
			System.out.println(c);
			c=(char)(c+1);// 영문의 경우 1을 더하면 다음 문자의 코드 값
		} while(c<='z');

	} 
}
