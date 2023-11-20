import java.util.Scanner;

											//exercício2//

public class Combustivel {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double km, l, r;
		
		System.out.println("Digite a distância percorrida (em kilômetros): ");
		km = ler.nextDouble();
		
		System.out.println("Digite a capacidade do tanque de combustível (em litros): ");
		l = ler.nextDouble();
		
		r = km/l;
		
		System.out.println("O gasto médio de combustível é igual a "+r+"km/l");
		
		if (r>=10) {
			System.out.println("O veículo é econômico");
		}else {
			System.out.println("O veículo não é econômico");
		}	
		ler.close();
	}
}
