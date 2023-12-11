import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int a[] = new int [10];
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("Digite o "+(i+1)+"° valor: ");
			a[i] = ler.nextInt();
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("\n\n"+(i+1)+"° valor : "+a[i]);
			System.out.print("Divisores de "+a[i]+": ");
			for (int j = 1; j <= a[i]; j++) {
				if(a[i] % j == 0) {
					System.out.print(j+" ");
				}
			}
		}
		
		ler.close();
	}
}
