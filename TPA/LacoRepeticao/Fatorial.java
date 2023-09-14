import java.util.Scanner;

public class Fatorial {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int m=1, n, i=1;
		System.out.println("Digite um numero:");
		n = ler.nextInt();
		
		while(i<=n) {
			m = m*i;
			i++;
		}
		System.out.println(m);
		ler.close();
	}
}
