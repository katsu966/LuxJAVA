package javaPractice1;

public class Constructure_Book {
	String title;
	String author;
	
	public Constructure_Book(String t) { // 생성자
		title = t;
		author = "작자미상";
	}

	public Constructure_Book(String t, String a) {
		title = t;
		author = a;
	}

	public static void main(String[] args) {
		Constructure_Book littlePrince = new Constructure_Book("어린왕자", "생택쥐페리");
		// (String t, String a) 를 가지고 있는 생성자 호출
		Constructure_Book loveStory = new Constructure_Book("춘향전");
		// (String t) 를 가지고 있는 생성자 호출
		System.out.println(littlePrince.title + " " + littlePrince.author);
		System.out.println(loveStory.title + " " + loveStory.author);
		
	}
}

