// exercício 7
import java.util.Scanner;

public class Fatorial {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		final int TAM = 15;
		
		int a[];
		a = new int [TAM];
		
		int b[];
		b = new int [TAM];
		
		
		for(int i = 0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"° valor");
			a[i] = ler.nextInt();
			b[i] = a[i];
			int f = 1;
			while(f<a[i]) {
				b[i] = b[i] * f;
				f++;
			}
		}
		
		for(int i = 0; i<TAM; i++) {
			System.out.println((i+1)+"° Valor = "+b[i]);
		}
		
		
		
	}
}
