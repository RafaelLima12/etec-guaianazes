//exercicio 8
import java.util.Scanner;

public class Somatorio {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		final int TAM = 10;
		
		int a[];
		a = new int [TAM];
		
		int b[];
		b = new int[TAM];
		
		for(int i = 0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"° valor");
			a[i] = ler.nextInt();
		}
		
		for (int i=0; i<10; i++) {
			int s = 0;
			
			for(int j = i; j< TAM; j++) {
				s +=a[j];
			}
			b[i] = s;
		}
		
		for (int i = 0; i<TAM; i++) {
			System.out.println(b[i]);
		}
		
	}
}

