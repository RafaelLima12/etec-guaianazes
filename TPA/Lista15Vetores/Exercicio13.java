//exercicio 13

import java.util.Scanner;
public class Exercicio13 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		final int TAM = 10;
		
		int i;
		
		int a[];
		a = new int [TAM];
		
		int b[];
		b = new int [TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+( i + 1)+"º número:");
			a[i] = ler.nextInt();
		}
		
		for(i=0; i<TAM; i++) {
			if(a[i] % 2 == 0) {
				b[i] = 1; 
			}else {
				b[i] = 0;	
			}
		}
		
		System.out.print("Valores de B: ");
		for(i=0; i<10; i++) {
			System.out.print(b[i]+" ");
		}
		
		ler.close();

	}

}