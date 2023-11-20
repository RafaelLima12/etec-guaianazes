import java.util.Scanner;

											//exercício8//

public class Media {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double n1, n2, n3, m1, m2;
		
		System.out.println("Digite a primeira nota:");
		n1 = ler.nextDouble();
		
		System.out.println("Digite a segunda nota");
		n2 = ler.nextDouble();
		
		m1 = (n1+n2)/2;
		
		System.out.println("Sua média é igual a "+m1);
		
		if(m1>6) {
			System.out.println("Aprovado");
		}else if(m1>=3) {
			System.out.println("Em exame");
			
			System.out.println("Digite a nota do exame: ");
			n3 = ler.nextDouble();
			
			m2 = (m1+n3)/2;
			
			System.out.println("Sua média é igual a "+m2);
			
			if(m2<6) {
				System.out.println("Reprovado");
			}else {
				System.out.println("Aprovado");
			}
		}else {
			System.out.println("Reprovado");
		}
		ler.close();
	}
}
