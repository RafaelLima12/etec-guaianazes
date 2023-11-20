import java.util.Scanner;

											//exercício3//

public class IMC {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double kg, m, r;
		
		System.out.println("Digite seu peso (em kg): ");
		kg = ler.nextDouble();
		
		System.out.println("Digite sua altura (em metros): ");
		m = ler.nextDouble();
		
		r = kg/(m*m);
		
		System.out.println("O seu IMC é igual a "+r);
		
		if(r<18.5) {
			System.out.println("Excesso de Magreza");		
		}else if(r<25) {
			System.out.println("Peso Normal");
		}else if(r<30) {
			System.out.println("Excesso de peso");
		}else if(r<35) {
			System.out.println("Obesidade (Grau I)");
		}else if(r<40) {
			System.out.println("Obesidade (Grau II)");
		}else {
			System.out.println("Obesidade (Grau III)");	
		}
		ler.close();
	}

}
