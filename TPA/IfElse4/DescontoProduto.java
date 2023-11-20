import java.util.Scanner;

public class DescontoProduto {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double desconto,valor;
		
		System.out.println("Digite o valor do produto: ");
		valor = ler.nextDouble();
		
		if(valor <=100) {
			System.out.println("Você irá pagar R$"+valor);
			
		}else if(valor<=500) {
			desconto = valor-(valor/20);
			System.out.println("Você irá pagar R$"+desconto);
			
		}else if(valor<=1000) {
			desconto = valor-(valor/10);
			System.out.println("Você irá pagar R$"+desconto);
			
		}else if(valor<=2000) {
			desconto = valor-(valor*0.15);
			System.out.println("Você irá pagar R$"+desconto);
			
		}else {
			desconto = valor*0.2;
			System.out.println("Você irá pagar R$"+desconto);
		}
		ler.close();
	}
}
