import java.util.Scanner;

public class NumeroPrimo {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int n = ler.nextInt();
		ler.close();
		
		if(n<=1) {
			System.out.println("Este número não é primo");
		}else {
			boolean primo = true;
			for(double i=2; i<=Math.sqrt(n);i++) {
				if(n%i==0) {
					primo = false;
					break;
				}
			}
			if(primo) {
				System.out.println("Este número é primo");
			}else {
				System.out.println("Este número não é primo");
			}
		}
	}
}
