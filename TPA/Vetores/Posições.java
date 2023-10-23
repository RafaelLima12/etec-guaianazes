import java.util.Scanner;

public class Posições {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 10;
		int a[], b[];
		
		a = new int [TAM];
		b = new int [TAM];
		
		for(int i = 0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"° valor");
			a[i] = ler.nextInt();
		}
		ler.close();
		
		for(int i = 0; i<TAM; i++) {
			b[i] = a[i];
		}
		
		System.out.print("\nB =[");
		for(int i = 9; i>=0; i--) {
			System.out.print(b[i]+", ");
		}
		System.out.print("]");
	}
}
