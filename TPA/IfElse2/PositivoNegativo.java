import java.util.Scanner;

public class PositivoNegativo {
	public static void main (String []args) {
		Scanner ler=new Scanner(System.in);
		double n;
		
		System.out.println("Digite um n�mero: ");
		n = ler.nextDouble();
		
		if(n>0) {
			System.out.println("Seu numero � Positivo ");
		
		}else if(n==0) {
			System.out.println("Seu n�mero � neutro ");
			
		}else {
			System.out.println("Seu n�mero � negativo ");
		}
		ler.close();
	}

}
