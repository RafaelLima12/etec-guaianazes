//exercicio 13

import java.util.Scanner;
public class Exercicio13 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int a[] = new int [10];
		
		int b[] = new int [10];
		
		for(int i = 0; i<a.length; i++) {
			System.out.println("Digite o "+(i+1)+"° valor");
			a[i] = ler.nextInt();
		}
		
		for(int i = 0; i<a.length; i++) {
			if(a[i]%2 == 0) {
				b[i] = 1;
			}else {
				b[i] = 0;
			}
		}
		
		System.out.print("\nB[");
		for(int i = 0; i<a.length; i++) {
			System.out.print(+b[i]+" ");
		}
		System.out.print("]");
		
		ler.close();

	}

}