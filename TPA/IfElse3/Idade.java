import java.util.Scanner;

											//exercício1//

public class Idade {
	public static void main(String []args) {
		Scanner ler = new Scanner(System.in);
		int anoNasc, anoAtual, idade;
		
		System.out.println("Escreva o Ano Atual: ");
		anoAtual = ler.nextInt();
		
		System.out.println("Escreva o ano de seu nascimento: ");
		anoNasc = ler.nextInt();
		
		idade = anoAtual-anoNasc;
		
		System.out.println("você tem "+idade+" anos de idade");
		
		if(idade<10) {
			System.out.println("Você é criança ");
			
		}else if(idade>=60) {
			System.out.println("você é idoso");
			
		}else if(idade>=18) {
			System.out.println("você é adulto ");
			
		}else {
			System.out.println("você é adolescente ");
		}
		ler.close();
	}

}
