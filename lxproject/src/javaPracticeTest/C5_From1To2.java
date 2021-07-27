package javaPracticeTest;

class TV{
	private int size;
	public TV(int size) {this.size = size;}
	protected int getSize() {return size;}
}

class ColorTV extends TV{	
	
	private int color;

	public ColorTV(int size, int color) {
		super(size);
		this.color = color; }
		protected int setColor() {return color;}

	public void printProperty() {
		System.out.println(getSize() + "인치 " + setColor() + "컬러");
	}
}
class IPTV extends ColorTV{
	private String adress;
	public IPTV(String adress, int size, int color) {
		super(size, color);
		this.adress = adress;
		}
	
		public void printProperty(){
		System.out.println("나의 IPTV는 " + adress + " 주소의 " + getSize() 
		+ " 인치 " + setColor());
	}
	}
	public class C5_From1To2{
		/* Test1
	public static void main(String[] args) {
	ColorTV myTV = new ColorTV(32, 1024);
	myTV.printProperty();
	*/

		// Test2
	public static void main(String[] args) {
			IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
			iptv.printProperty();
		}
	}

