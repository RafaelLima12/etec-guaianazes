import java.util.Scanner;

public class Potencia {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i=1, b, n, e;
		
		System.out.println("Digite a base: ");
		b = ler.nextInt();
		n = b;
		
		System.out.println("Digite o expoente: ");
		e = ler.nextInt();
		
		while(i<e) {
			b*=n;
			i++;
		}
		System.out.println("Base="+n+", expoente="+e+", potencia="+b);
		ler.close();
	}
}
