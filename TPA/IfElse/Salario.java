import java.util.Scanner;

public class Salario {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double sm, s;
		
		System.out.println("Digite o valor do Salário mínimo: ");
		sm = ler.nextDouble();
		
		System.out.println("Digite o seu Salário: ");
		s = ler.nextDouble();
		
		if(s<sm) {
			System.out.println("Seu Salário não é Adequado");
		}else{
			System.out.println("Seu Salário é Adequado");
			
		}
		ler.close();
	}
}
