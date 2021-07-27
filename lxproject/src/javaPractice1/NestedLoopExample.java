package javaPractice1;

public class NestedLoopExample {
public static void main(String[] args) {
	for(int i=1; i<10; i++) { // 전항
		for(int j=1; j<10; j++) { //후항  
			System.out.println(i + "*" + j + "=" +i*j); // 구구셈 출력
			System.out.println('\t'); // 식 하나씩 탭으로 띄기
			
		}
		System.out.println();// 한 단이 끝나면 다음줄로 커서 이동
	}
}
}
