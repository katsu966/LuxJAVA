package src.javaPractice;

import java.util.*;

public class Calculator {

public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		String operand = input.next();
		
		System.out.print("���� 2���� �Է��ϼ���: ");
		double num1=input.nextDouble();
		double num2=input.nextDouble();
		
		if(operand=="+") {
			System.out.println(num1+ "+" + num2+ "=" +(num1+num2));
		}
		else if(operand=="-") {
			System.out.println(num1+ "-" + num2+ "=" +(num1-num2));
		}
		else if(operand=="*") {
			System.out.println(num1+ "*" + num2+ "=" +(num1*num2));
		}
		else if(operand=="/") {
			if (num2==0) {
				System.out.println("0�� ���� ���� �����ϴ�");
			}
			else{
				System.out.println(num1+ "/" + num2+ "=" +(num1/num2));
			}
		}
	}

}



