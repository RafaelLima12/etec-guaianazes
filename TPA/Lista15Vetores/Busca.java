//exercicio 11

import java.util.Scanner;

public class Busca {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n, a[] = new int [10];
		
		for (int i = 0; i<a.length; i++) {
			System.out.println("Digite o "+(i+1)+"° número");
			a[i] = ler.nextInt();
		}
		
		System.out.println("Busca:");
		
		System.out.println("Qual numero você deseja buscar?");
		n = ler.nextInt();
		
		for (int i = 0; i<a.length; i++) {
			if(a[i] == n) {
				System.out.println("O número "+n+" está na "+(i+1)+"° posição");
				break;
			}else if(i == 9) {
				System.out.println("O número não foi encontrado");
			}
		}
		ler.close();
	}
}