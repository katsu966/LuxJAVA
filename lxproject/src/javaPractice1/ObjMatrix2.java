package javaPractice1;

import java.util.Scanner;

class ObjMatrix3 {
String title, author;
public ObjMatrix3(String title, String author) { // ������
	this.title = title;
	this.author = author;
	
}
}

public class ObjMatrix2{
	public static void main(String[] args) {
		ObjMatrix3 [ ]obj = new ObjMatrix3[2];
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<obj.length; i++) { // objMatrix2.length = 2
			System.out.print("����>>");
			String title = sc.nextLine();
			System.out.print("����>>");
			String author = sc.nextLine();
			obj[i] = new ObjMatrix3(title, author); // �迭 ���� ��ü ����
		}
		
		for(int i=0; i<obj.length; i++)
			System.out.print("(" + obj[i].title + ", " + obj[i].author + ")");
			sc.close();
	}
}