package src.javaPractice;

class Person{
	private int weight; // Private ���� ����, Student Ŭ�������� ���� �Ұ�
	int age; // ����Ʈ ���� ����, Student Ŭ�������� ���� ����
	protected int height; // protected ���� ����, Student Ŭ�������� ���� ����
	public String name; // public ���� ����, Student Ŭ�������� ���� ����
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
public int getWeight() {
	return weight;
}
}
class Student extends Person{
	public void set() {
		age = 26; // ����Ŭ������ ����Ʈ ��� ���� ����
		name = "�赵��"; // ����Ŭ������ public ��� ���� ����
		height = 177;// ����Ŭ������ protected ��� ���� ����
		//weight = 73;// ����Ŭ������ private ��� ���� �Ұ���
		setWeight(73); // private ��� weight�� setWeight()�� ���� ����
	}
}
public class InheritanceEx {
	public static void main(String[] args) {
	Student s = new Student();
	s.set();
	
}
}
