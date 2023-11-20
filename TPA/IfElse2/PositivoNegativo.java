import java.util.Scanner;

public class PositivoNegativo {
	public static void main (String []args) {
		Scanner ler=new Scanner(System.in);
		double n;
		
		System.out.println("Digite um número: ");
		n = ler.nextDouble();
		
		if(n>0) {
			System.out.println("Seu numero é Positivo ");
		
		}else if(n==0) {
			System.out.println("Seu número é neutro ");
			
		}else {
			System.out.println("Seu número é negativo ");
		}
		ler.close();
	}

}
