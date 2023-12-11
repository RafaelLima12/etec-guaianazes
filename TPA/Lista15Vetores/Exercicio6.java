
public class Exercicio6 {
	public static void main(String[] args) {
		
		int a[] = new int [11];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = 1;
			for (int j = 0; j < i; j++) {
				a[i] *= 2;
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("A["+i+"] = "+a[i]);
		}
	}
}
