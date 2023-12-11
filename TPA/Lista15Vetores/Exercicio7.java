import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int a[] = new int [15];
		int b[] = new int [15];
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("Digite o "+(i+1)+"° valor");
			a[i] = ler.nextInt();
			int c = a[i];
			b[i] = 1;
			for (int j = c; j > 0; j--) {
				b[i] *= c;
				c--;
			}
		}
		
		for (int i = 0; i < b.length; i++) {
			System.out.println("Fatorial de "+a[i]+" = "+b[i]);
		}
		
		ler.close();
	}
}
