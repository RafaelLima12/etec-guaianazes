
import java.util.Scanner;

public class Salario {
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		double sal;
		
		System.out.println("Escreva o seu Salário: ");
		sal = ler.nextDouble();
		
		if(sal==954) {
			System.out.println("Voce ganha o equivalente a um salário minímo ");	
			
		}else if(sal>954) {
			System.out.println("O seu salário está acima do salário minímo ");
		}else {
			System.out.println("Você ganha menos que um salário mínimo");
		}
		ler.close();	
	}

}
