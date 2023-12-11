import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int a[] = new int [10];
		int b[] = new int [10];
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("Digite o "+(i+1)+"° valor");
			a[i] = ler.nextInt();
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				b[i] += a[j];
			}
			System.out.println(b[i]);
		}
		
		ler.close();
	}
}
