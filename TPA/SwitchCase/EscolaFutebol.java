import java.util.Scanner;

public class EscolaFutebol {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		int i;
		
		System.out.println("Escreva a idade do aluno");
		i = ler.nextInt();
		
		switch(i) {
		case 6:
			System.out.println("Classificação: Dente de leite");
			break;
		case 7:
			System.out.println("Classificação: Júnior");
			break;
		case 8:
			System.out.println("Classificação: Júnior max");
			break;
		case 9:
			System.out.println("Classificação: Júnior master");
			break;
		case 10:
			System.out.println("Classificação: Master");
			break;
		default:
			System.out.println("Idade invalida");
		}
		ler.close();
	}
}
