package src.javaPractice;

public class StarPrint3 {
	public static void main(String[] args) {
		for (int a = 1; a < 5; a++) {//줄 4번 반복
			for (int b = 4; b > 0; b--) {// 4칸 설정 
				if (a < b) {// b가 a보다 클때까지는 공백
					System.out.print(" ");
				} else {//b가 a와 같거나 작아지는 순간 *
					System.out.print("*");
				}

			}
			System.out.println();
		}
	}
}
