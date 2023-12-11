import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int a[] = new int [20];
		int b[] = new int [20];
		
		int c = a.length-1, d = 0;
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("Digite o "+(i+1)+"° valor: ");
			a[i] = ler.nextInt();
			if(a[i] % 2 == 0) {
				b[d] = a[i];
				d++;
			}else {
				b[c] = a[i];
				c--;
			}
		}
		System.out.print("B = [");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println("]");
		
		ler.close();
	}
}
