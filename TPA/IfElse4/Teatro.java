import java.util.Scanner;

public class Teatro {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double ingreco, desconto;
		String s = "sim";
		
		
		System.out.println("Escreva o valor do ingresso:");
		ingreco = ler.nextDouble();
		
		System.out.println("Você é estudante? (responda com 'sim' ou 'nao')");
		s = ler.next();
		
		if (s.equalsIgnoreCase("sim")) {
			desconto = ingreco*0.50;
			System.out.println("Você irá pagar R$"+desconto);
		}else {
			System.out.println("Você irá pagar inteira");
		}
		ler.close();
	}
}
