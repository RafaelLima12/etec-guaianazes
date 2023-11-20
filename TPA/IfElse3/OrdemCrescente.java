import java.util.Scanner;

											//exercício6//

public class OrdemCrescente {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double n1, n2, n3;
		
		System.out.println("Digite o primeiro valor: ");
		n1 = ler.nextDouble();
		
		System.out.println("Digite o segundo valor: ");
		n2 = ler.nextDouble();
		
		System.out.println("Digite o terceiro valor: ");
		n3 = ler.nextDouble();
		
		if(n1<=n2 && n1<=n3) {
			System.out.println(n1+", ");
			if (n2<=n3) {
				System.out.println(n2+", "+n3);
			}else {
				System.out.println(n3+", "+n2);
			}
		}else if(n2<=n1 && n2<=n3) {
			System.out.println(n2+", ");
			if(n1<=n3) {
				System.out.println(n1+", "+n3);
			}else {
				System.out.println(n3+", "+n1);
			}
		}else {
			System.out.println(n3+", ");
			if(n1<=n2) {
				System.out.println(n1+", "+n2);
			}else {
				System.out.println(n2+", "+n1);
			}
		}
		ler.close();
	}
}
