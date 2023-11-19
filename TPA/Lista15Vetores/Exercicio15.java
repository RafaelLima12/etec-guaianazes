import java.util.Scanner;

public class Exercicio15 {

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
			b[i] = a[i];
			c[i] = a[i];
		}
		
		int n;
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<a.length; j++) {
				if(b[i]<b[j]) {
					n = b[i];
					b[i] = b[j];
					b[j] = n;
				}
			}
		}
		
		n = 0;
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<a.length; j++) {
				if(c[i]>c[j]) {
					n = c[i];
					c[i] = c[j];
					c[j] = n;
				}
			}
		}
		
		System.out.print("\nordem Crescente:\nB[ ");
		for(int i = 0; i<a.length; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.print("]");
		
		
		System.out.print("\n\nordem Decrescente:\nC[ ");
		for(int i = 0; i<a.length; i++) {
			System.out.print(c[i]+" ");
		}
		System.out.print("]");
        
        ler.close();
    }
}