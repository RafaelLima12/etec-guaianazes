import java.util.Scanner;

public class Viagem {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double pass, vol, marcar, total;
		String s = "sim";
		
		System.out.println("Digite o valor da passagem:");
		pass = ler.nextDouble();
		
		System.out.println("Você deseja despachar bagagem?(responda com 'sim' ou 'nao')");
		s = ler.next();
		if(s.equalsIgnoreCase("sim")) {
			System.out.println("Quantos volumes serão despachados? (A cada volume despachado é adicionado R$90 a sua compra)");
			vol = ler.nextDouble();
			vol = vol*90;
			System.out.println("Será adicionado R$"+vol+" na sua compra");
		}else {
			vol = 0;
		}
		
		System.out.println("Você deseja marcar assento?");
		s = ler.next();
		
		if(s.equalsIgnoreCase("sim")) {
			marcar = 60;
			System.out.println("Será adicionado R$60 na sua compra");
		}else {
			marcar = 0;
		}
		
		total = pass+vol+marcar;
		System.out.println("Você irá pagar R$"+total);
		
		ler.close();
	}
}
