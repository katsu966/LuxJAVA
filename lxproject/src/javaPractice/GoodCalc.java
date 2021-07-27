package src.javaPractice;

abstract class Calcul{
	public abstract int add(int a, int b); // 두 정수의 합을 구하여 리턴
	public abstract int subtract(int a, int b); // 두 정수의 차를 구하여 리턴
	public abstract double average(int[] a); // 배열에 저장된 정수의 평균 리턴
}

public class GoodCalc extends Calcul {
	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int subtract(int a, int b) {
		return a - b;
	}

	@Override
	public double average(int[] a) {
		double sum = 0;
		for(int i = 0; i<a.length; i++)
			sum += a[i];
		return sum/a.length;
		
}
	public static void main(String[] args) {
		GoodCalc c = new GoodCalc();
		System.out.println(c.add(2, 3));
		System.out.println(c.subtract(2, 3));
		System.out.println(c.average(new int [] {2, 3, 4}));
	}
}