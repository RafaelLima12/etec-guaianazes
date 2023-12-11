import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a[] = new int [10];
		
		int b[] = new int [10];
		
		int c[] = new int [10];
		
		for(int i = 0; i<a.length; i++) {
			System.out.println("Digite o "+(i+1)+"° valor de A");
			a[i] = ler.nextInt();
		}
		
		for(int i = 0; i<a.length; i++) {
			System.out.println("Digite o "+(i+1)+"° valor de B");
			b[i] = ler.nextInt();
		}
		
		for(int i = 0; i<a.length; i++) {
			if(a[i]>b[i]) {
				c[i] = 1;
			}else if(a[i] == b[i]) {
				c[i] = 0;
			}else {
				c[i] = -1;
			}
		}
		
		System.out.print("\nC[ ");
		for(int i = 0; i<a.length; i++) {
			System.out.print(c[i]+" ");
		}
		System.out.print("]");
		
		ler.close();
	}
}