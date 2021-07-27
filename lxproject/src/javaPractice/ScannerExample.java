package src.javaPractice;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요");
		/*
		 * next()는 공백으로 입력된 문자열 구분
		 * nextLine()은 공백이 낀 문자열을 담을수 있음, 엔터로 구분
		 */
		
		String name = scanner.next();
		System.out.print("이름은 " +  name  + ", ");
		
		String city = scanner.next();
		System.out.print("도시는 " + city + ", ");
		
		int age = scanner.nextInt();
		System.out.print("나이는 " + age + "살, ");
		
		double weight = scanner.nextDouble();
		System.out.print("체중은 "+ weight + "kg, ");
		
		boolean isSingle = scanner.nextBoolean();
		System.out.println("독신 여부는 " + isSingle + "입니다. ");
		
		scanner.close();
		
	}

}
