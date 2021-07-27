package javaPractice1;

public class OperatorExample {
	public static void main(String[] args) {
		int a = 3, b = 3, c = 3;
		// 대입 연산자 사례
		a += 3; // a=a+3 = 6
		b *= 3; // b=b*3 = 9
		c %= 2; // c=c%2 = 1
		System.out.println("a=" + a + ", b=" + b + ", c=" + c);

		int d = 3;
		// 증감 연산자 사례
		a = d++; // a=3, d=4, 변수 a와 d의 초깃값 대입
		System.out.println("a=" + a + ", d=" + d);
		a = ++d; // d=5 a=5, 앞에 붙은 경우 d 대입값에 바로 +1 a에 영향 끼침
		System.out.println("a=" + a + ", d=" + d);
		a = d--; // a=5 d=4, 뒤에 붙은 경우 윗 계산의 a의 계산값 대입 -1된 d의 값이 a에 영향 끼치지 않음
		System.out.println("a=" + a + ", d=" + d);
		a = --d; // d=3 a=3, d의 값이 -1이 앞에 붙은 값으로 a에 영향을 끼침
		System.out.println("a=" + a + ", d=" + d);

	}

}
