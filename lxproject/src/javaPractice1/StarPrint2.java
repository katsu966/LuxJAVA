package javaPractice1;

public class StarPrint2 {
	public static void main(String[] args) {
		for (int a = 1; a < 5; a++) {// 줄 4번반복
			for (int b = 0; b < a; b++) {// b가 a보다 작을때까지만 * 반복 
				System.out.print("*");
			}System.out.println();
		}
	}
}
