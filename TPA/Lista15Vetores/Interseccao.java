//exercicio 9
import java.util.Scanner;

public class Interseccao {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		final int TAM = 10;
		
		int a[];
		a = new int [TAM];
		
		int b[];
		b = new int [TAM];
		
		int c[];
		c = new int [TAM];
		
		for(int i = 0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"° valor de A");
			a[i] = ler.nextInt();
		}
		for(int i = 0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"° valor de B");
			b[i] = ler.nextInt();
		}
		for(int i = 0; i<TAM; i++) {
			for(int j = 0; j<TAM; j++) {
				if (b[j]==a[i]) {
					c[i] = a[i];
				}
			}
		}
		System.out.print("C [");
		for(int i = 0; i<TAM; i++) {
			System.out.print(c[i]+", ");
		}
		System.out.println("]");
	}
}
