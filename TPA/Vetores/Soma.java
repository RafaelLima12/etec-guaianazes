import java.util.Scanner;

public class Soma {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		final int TAM = 10;
		int a[], b[], c[];
		
		a = new int[TAM];
		b = new int[TAM];
		c = new int[TAM];
		
		System.out.println("Leitura vetor A");
		for(int i = 0; i<TAM; i++) {
			System.out.println("Escreva o "+(i+1)+"° valor:");
			a[i] = ler.nextInt();
		}
		
		System.out.println("\n Leitura vetor B");
		for(int i = 0; i<TAM; i++) {
			System.out.println("Escreva o "+(i+1)+"° valor:");
			b[i] = ler.nextInt();
		}
		ler.close();
		
		System.out.print("\nC =[");
		for(int i = 0; i<TAM; i++) {
			c[i] = a[i]+b[i];
			System.out.print(c[i]+", ");
		}
		System.out.print("]");
	}
}
