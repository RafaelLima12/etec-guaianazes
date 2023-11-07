//exercicio 3

import java.util.Scanner;

public class NumerosPrimos {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		final int TAM = 10;
		
		int a[];
		a = new int[TAM];
		
		int qtd[];
		qtd = new int[TAM];
		
		for(int i = 0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"° número");
			a[i] = ler.nextInt();
			for(int j=1; j<=a[i];j++) {
				if(a[i]%j==0) {
					qtd[i]++;
				}
			}
		}
		for(int i = 0; i<TAM; i++) {
			if(qtd[i]<3 && a[i]>1) {
				System.out.println("O "+(i+1)+"° número = "+a[i]+" É primo");
			}else {
				System.out.println("O "+(i+1)+"° número = "+a[i]+" não é primo");
			}
		}
		
		ler.close();
	}
}
