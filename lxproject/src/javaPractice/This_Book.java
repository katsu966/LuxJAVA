package src.javaPractice;

public class This_Book {
	String title;
	String author;
	
	void show() {System.out.println(title + " " + author);}
	
	public This_Book() {
		this("","");
		System.out.println("������ ȣ���");
		
	}
	public This_Book(String title) {
	this(title, "���ڹ̻�");
		
	}
public This_Book(String title, String author){
	this.title = title;
	this.author = author;
	
}
public static void main(String[] args) {
	This_Book littlePrince = new This_Book("�����", "�������丮");
	This_Book loveStory = new This_Book("������");
	This_Book emptyBook = new This_Book();
	loveStory.show();
}
}