package javaPractice1;

import java.util.Scanner;

class ObjMatrix3 {
String title, author;
public ObjMatrix3(String title, String author) { // 积己磊
	this.title = title;
	this.author = author;
	
}
}

public class ObjMatrix2{
	public static void main(String[] args) {
		ObjMatrix3 [ ]obj = new ObjMatrix3[2];
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<obj.length; i++) { // objMatrix2.length = 2
			System.out.print("力格>>");
			String title = sc.nextLine();
			System.out.print("历磊>>");
			String author = sc.nextLine();
			obj[i] = new ObjMatrix3(title, author); // 硅凯 盔家 按眉 积己
		}
		
		for(int i=0; i<obj.length; i++)
			System.out.print("(" + obj[i].title + ", " + obj[i].author + ")");
			sc.close();
	}
}