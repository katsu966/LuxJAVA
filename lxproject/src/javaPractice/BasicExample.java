package src.javaPractice;

public class BasicExample { 
	
	public static int sum(int n, int m){ //매개변수 n, m 
		return n + m;// n과 m의 합 리턴
	}

	
	public static void main(String[] arg) {
		/*
		 * 메소드(함수)인 main()은 반드시 public static void 타입으로 선언해야하며 한 클래스에 2개이상의 main()을 작성하면 안된다.
		 * main 메소드는 자바 어플리케이션 실행시 제일먼저 동작하며 어느 객체에서든 접근할수 있으며 자바가 컴파일 되는 순간 정의되는 돌려주는 값이없는 함수
		 * String[] = 연속적인 문자열 데이터가 들어가는 저장공간(배열), arg는 단순 변수명 다르게 지정해도 상관없음
		 */
		
		// 지역변수: 메소드 내에서만 선언되어 사용되는 변수
		int i = 20; // 변수 i의 선언과 동시에 20으로 초기화
		int s; // 데이터타입(자료형) 변수; 
		char a;
		
		s = sum(i, 10); // 메소드 호출
		a = '?';
		
		//System.out.print는 화면 출력을 하기위한 것으로 ln을 붙이면 출력후 다음행으로 넘어간다.
		System.out.println(a);
		System.out.println("Hello");
		System.out.println(s);
  }
}

