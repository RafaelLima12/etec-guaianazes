import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i=0, n, ant=0, at=1, suc;
		
		System.out.println("Digite até quanto você deseja que seja calculada a sequencia de Fibonacci: ");
		n = ler.nextInt();
		
		while(i<n) {
			suc=ant+at;
			ant=at;
			at=suc;
			
			i++;
			System.out.print(suc+", ");
		}
		ler.close();
	}

}
