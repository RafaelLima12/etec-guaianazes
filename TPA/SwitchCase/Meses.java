import java.util.Scanner;

public class Meses {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n;
		
		System.out.println("Digite um n�mero de 1 a 12 de um m�s qualquer");
		n = ler.nextInt();
		
		switch(n) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Este m�s possui 31 dias");
			break;
		
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Este m�s possui 30 dias");
			break;
			
		case 2:
			System.out.println("Este m�s possui 28 dias");
			break;
			
		default:
			System.out.println("M�s invalido");
		}
		ler.close();
	}
}
