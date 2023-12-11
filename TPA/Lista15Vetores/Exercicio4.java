import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int a[] = new int [10];
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("Digite o "+(i+1)+"° valor: ");
			a[i] = ler.nextInt();
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("\n\n"+(i+1)+"° valor : "+a[i]);
			System.out.print("Pares de 0 até "+a[i]+": ");
			for (int j = 0; j <= a[i]; j++) {
				if(j % 2 == 0) {
					System.out.print(j+" ");
				}
			}
		}
		
		ler.close();
	}
}
