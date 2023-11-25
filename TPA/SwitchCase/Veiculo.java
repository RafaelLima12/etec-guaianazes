import java.util.Scanner;

public class Veiculo {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n;
		
		System.out.println("escreva o ultimo numero da placa do veiculo:");
		n = ler.nextInt();
		
		switch (n) {
		case 1:
		case 2:
			System.out.println("Você não podera dirigir segunda-feira");
			break;
		case 3:
		case 4:
			System.out.println("Você não podera dirigir terça-feira");
			break;
		case 5:
		case 6:
			System.out.println("Você não podera dirigir quarta-feira");
			break;	
		case 7:
		case 8:
			System.out.println("Você não podera dirigir quinta-feira");
			break;
		case 9:
		case 0:
			System.out.println("Você não podera dirigir sexta-feira");
			break;
		default:
			System.out.println("numero invalido");
		}
		ler.close();
	}
}
