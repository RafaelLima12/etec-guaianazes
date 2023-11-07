//exercicio 2

import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		final int TAM = 5;
		
		int a[];
		int r;
		
		a= new int [TAM];
		
		for(int i = 0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"° número");
			a[i] = ler.nextInt();
		}for(int i = 0; i<TAM; i++) {
			System.out.println("\nTabuada do "+a[i]);
			for(int j = 1; j<=10; j++) {
				r = j*a[i];
				System.out.println(a[i]+" * "+j+" = "+r);
			}
		}
		ler.close();
	}
}
