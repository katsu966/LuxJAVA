package javaPractice1;

public class StarPrint4 {
	public static void main(String[] args) {
		for (int i = 5; i > 0; i--) {// 중첩문과의 관계를 고려한 줄 5번 반복
			for (int j = 0; j < i; j++) { //j가 i보다 작을때 까지 * 반복 
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
