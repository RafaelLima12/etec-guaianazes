
import java.util.Scanner;

public class Salario {
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		double sal;
		
		System.out.println("Escreva o seu Sal�rio: ");
		sal = ler.nextDouble();
		
		if(sal==954) {
			System.out.println("Voce ganha o equivalente a um sal�rio min�mo ");	
			
		}else if(sal>954) {
			System.out.println("O seu sal�rio est� acima do sal�rio min�mo ");
		}else {
			System.out.println("Voc� ganha menos que um sal�rio m�nimo");
		}
		ler.close();	
	}

}
