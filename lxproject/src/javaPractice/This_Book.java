package src.javaPractice;

public class This_Book {
	String title;
	String author;
	
	void show() {System.out.println(title + " " + author);}
	
	public This_Book() {
		this("","");
		System.out.println("생성자 호출됨");
		
	}
	public This_Book(String title) {
	this(title, "작자미상");
		
	}
public This_Book(String title, String author){
	this.title = title;
	this.author = author;
	
}
public static void main(String[] args) {
	This_Book littlePrince = new This_Book("어린왕자", "생택쥐페리");
	This_Book loveStory = new This_Book("춘향전");
	This_Book emptyBook = new This_Book();
	loveStory.show();
}
}