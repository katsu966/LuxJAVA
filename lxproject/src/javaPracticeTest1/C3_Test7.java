package javaPracticeTest1;

public class C3_Test7 {
	public static void main(String[] args) {
		int a[] = new int[10];
		int sum = 0;
		System.out.print("·£´ýÇÑ Á¤¼öµé :");
		for(int i=0; i<10; i++) {
			a[i] = (int)(Math.random()*10+1);
			System.out.print(a[i]+" ");
			sum += a[i];
			
		}
		System.out.println("\nÆò±ÕÀº " + (double)sum/a.length);
	}

}
