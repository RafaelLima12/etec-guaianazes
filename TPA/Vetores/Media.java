import java.util.Scanner;

public class Media {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 10;
		int a[];
		double s = 0;
		
		a = new int [TAM];
		
		for(int i = 0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"° valor:");
			a[i] = ler.nextInt();
		}
		ler.close();
		
		for(int i = 0; i<TAM; i++) {
			s=s+a[i];
		}
		s=s/TAM;
		System.out.println("\nMédia = "+ s);
	}
}
