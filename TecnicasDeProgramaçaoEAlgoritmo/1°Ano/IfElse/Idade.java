import java.util.Scanner;

public class Idade {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double a1, a2, r;
		
		System.out.println("Digite o Ano Atual");
		a1 = ler.nextDouble();
		
		System.out.println("Digite seu Ano de Nascimento");
		a2 = ler.nextDouble();
		
		r = a1-a2;
		
		System.out.println("Você tem "+r+" anos de idade");		
		if(r<18) {
			System.out.println("Você é Menor de Idade");
		}else {
			System.out.println("Você é Maior de Idade");			
		}

		ler.close();
	}
}

