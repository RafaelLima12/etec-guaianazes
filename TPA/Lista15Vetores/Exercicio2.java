import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int a[] = new int [5];
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("Digite o "+(i+1)+"° valor: ");
			a[i] = ler.nextInt();
		}
			
		for (int i = 0; i < a.length; i++) {
			System.out.println("\nTabuada do "+a[i]);
			for (int j = 1; j <= 10; j++) {
				System.out.println(j+" * "+a[i]+" = "+j*a[i]);
			}
		}
		
		ler.close();
	}
}
