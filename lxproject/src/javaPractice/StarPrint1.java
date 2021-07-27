package src.javaPractice;

public class StarPrint1 {
	public static void main(String[] args) {
		for (int i = 1; i < 4; i++) { // 줄 3번까지 반복
			for (int j = 1; j < 5; j++) {// *4번까지 반복
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
