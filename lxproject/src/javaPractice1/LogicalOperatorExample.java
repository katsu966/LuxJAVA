package javaPractice1;

public class LogicalOperatorExample {
	public static void main(String[] args) {
		/*
		 * 간단한 논리 연산자
		 * !a = NOT 연산, a가 true면 false, false면 true  
		 * a || b = a와 b의 OR연산, a와 b 모두 false인 경우에만 false(즉, 둘중하나 참이면 참)
		 * a && b  = a와 b의 AND연산, a와 b모두 true인 경우에만 true
		 */
	// 비교연산
	System.out.println('a' > 'b'); // a가 b보다 큰지 작은지 알수 없기 때문에 false
	System.out.println(3 >= 2); // t
	System.out.println(-1 < 0); // t
	System.out.println(3.45 <= 2);// f
	System.out.println(3 == 2); // f
	System.out.println(3 != 2); // t
	System.out.println(!(3 != 2)); // f
	
	// 비교 연산과 논리 연산의 결합
	System.out.println((3 > 2) && (-1 > 0));
	System.out.println((3 != 2) || (-1 > 0));
	}

}
