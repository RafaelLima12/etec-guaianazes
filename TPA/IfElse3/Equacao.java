import java.util.Scanner;

											//exercício4//

public class Equacao {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double a, b, c, x;
		
		System.out.println("digite o valor de A: ");
		a = ler.nextDouble();
		
		System.out.println("Digite o valor de B: ");
		b = ler.nextDouble();
		
		System.out.println("Digite o valor de C: ");
		c = ler.nextDouble();
		
		x = b *b -4 *a *c;
		
		System.out.println("Delta é igual a: "+x);
		
		if(x<0) {
			System.out.println("Não existem raízes reais para a equação");
		}else if(x==0) {
			System.out.println("Existe apenas apenas uma raiz real para a equação");
		}else {
			double x1 = (-b + Math.sqrt(x)) / (2 * a);
            double x2 = (-b - Math.sqrt(x)) / (2 * a);
            System.out.println("As raízes da equação são: " + x1 + " e " + x2);
		}
		ler.close();
	}

}
