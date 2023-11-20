import java.util.Scanner;

											//exercício9//

public class Irpf {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double sal, irpf;
		
		System.out.println("Digite o seu salario");
		sal = ler.nextDouble();
		
		if(sal>3582) {
			irpf = sal*27.5/100-662.94;
			System.out.println("Seu desconto do IRPF é igual a "+irpf);
			
		}else if(sal>2866.71) {
			irpf = sal*22.5/100-483.84;
			System.out.println("Seu desconto do IRPF é igual a "+irpf);
		
		}else if(sal>2150.01) {
			irpf = sal*15.0/100-268.84;
			System.out.println("Seu desconto do IRPF é igual a "+irpf);
		
		}else if(sal>1434.60) {
			irpf = sal*7.5/100-107.59;
			System.out.println("Seu desconto do IRPF é igual a "+irpf);
		}else {
			System.out.println("Isento");
		}
		ler.close();
	}
}
