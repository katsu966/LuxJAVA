package javaPractice1;

public class Constructure_Book {
	String title;
	String author;
	
	public Constructure_Book(String t) { // ������
		title = t;
		author = "���ڹ̻�";
	}

	public Constructure_Book(String t, String a) {
		title = t;
		author = a;
	}

	public static void main(String[] args) {
		Constructure_Book littlePrince = new Constructure_Book("�����", "�������丮");
		// (String t, String a) �� ������ �ִ� ������ ȣ��
		Constructure_Book loveStory = new Constructure_Book("������");
		// (String t) �� ������ �ִ� ������ ȣ��
		System.out.println(littlePrince.title + " " + littlePrince.author);
		System.out.println(loveStory.title + " " + loveStory.author);
		
	}
}

