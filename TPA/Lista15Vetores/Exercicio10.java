import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int a[] = new int [10];
		int b[] = new int [10];
		int c[] = new int [10];
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("Digite o "+(i+1)+"° valor de A: ");
			a[i] = ler.nextInt();
		}
		
		int d = 0;
		
		for (int i = 0; i < b.length; i++) {
			System.out.println("Digite o "+(i+1)+"° valor de B: ");
			b[i] = ler.nextInt();
		}
		
		for (int i = 0; i < b.length; i++) {
			int j;
			for (j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					break;
				}
			}
			
			if (j == 10) {
				c[d] = a[i];
				d++;
			}
		}
		
		System.out.print("\nDiferença:\nC[");
        for (int i = 0; i < d; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.print("]");
        
        ler.close();
    }
}
