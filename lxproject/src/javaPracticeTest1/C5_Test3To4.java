package javaPracticeTest1;

import java.util.Scanner;

abstract class Converter {
	abstract protected double convert(double src);// �߻�޼ҵ�

	abstract protected String getSrcString(); // �߻�޼ҵ�

	abstract protected String getDestString(); // �߻�޼ҵ�

	protected double ratio; // ����

	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString() + "�� " + getDestString() + "�� �ٲߴϴ�");
		System.out.print(getSrcString() + "�� �Է��ϼ��� >>");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("��ȯ���: " + res + getDestString() + "�Դϴ�");
		scanner.close();
	}
}

/*
 * 3������ class Won2Dollar extends Converter {
 *
 * public Won2Dollar(double ratio) { this.ratio = ratio;
 *
 * }
 *
 * @Override protected double convert(double src) { return src = src/ratio; }
 *
 * @Override protected String getSrcString() {
 *
 * return "��ȭ"; }
 *
 * @Override protected String getDestString() {
 *
 * return "�޷�"; }
 *
 * }
 *
 * public class C5_From3To4 { public static void main(String[] args) {
 * Won2Dollar toDollar = new Won2Dollar(1200); // 1�޷��� 1200�� toDollar.run(); } }
 */
class Km2Mile extends Converter {

	public Km2Mile(double ratio) {
		this.ratio = ratio;
	}

	@Override
	protected double convert(double src) {
		return src = src / ratio;
	}

	@Override
	protected String getSrcString() {
		return "km";
	}

	@Override
	protected String getDestString() {
		// TODO Auto-generated method stub
		return "mile";
	}
}

public class C5_Test3To4 {
	public static void main(String[] args) {
		Km2Mile toMile = new Km2Mile(1.6);
		toMile.run();
	}
}
