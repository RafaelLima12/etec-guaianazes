import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		final int TAM = 10;
		
		int i;
		
		int a[];
		a = new int [TAM];
		
		int b[];
		b = new int [TAM];
		
		int c[];
		c = new int [TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+( i + 1)+"º número de A:");
			a[i] = ler.nextInt();
		}
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+( i + 1)+"º número de B:");
			b[i] = ler.nextInt();
		}
		
		for(i=0; i<TAM; i++) {
			if(a[i] > b[i]) {
				c[i] = 1;
			}else if(a[i] == b[i]) {
				c[i] = 0;
			}else {
				c[i] = -1;
			}
		}
		
		System.out.print("valores de C: ");
		for(i=0; i<c.length; i++) {
			System.out.print(c[i]+" ");
		}
		ler.close();
	}

}