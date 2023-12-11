import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int a[] = new int [10];
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("Digite o "+(i+1)+"° valor: ");
			a[i] = ler.nextInt();
		}
		
		for (int i = 0; i < a.length; i++) {
			int qtd = 0;
			for (int j = 1; j <= a[i]; j++) {
				if (a[i] % j == 0) {
					qtd++;
				}
			}
			System.out.print("\nO "+(i+1)+"° valor '"+a[i]+"' ");
			if(qtd < 3 && a[i] > 1) {
				System.out.print("É primo");
			}else {
				System.out.print("Não é primo");
			}
		}
		
		ler.close();
	}
}
