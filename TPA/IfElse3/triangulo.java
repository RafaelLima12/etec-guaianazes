import java.util.Scanner;

											//exercício5//

public class triangulo {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double a, b, c;
		
		System.out.println("Digite oprimeiro valor: ");
		a = ler.nextDouble();
		
		System.out.println("Digite o segundo valor: ");
		b = ler.nextDouble();
		
		System.out.println("digite o terceiro valor: ");
		c = ler.nextDouble();
		
		if(a==b && b==c) {
			System.out.println("Triângulo Equilatero");
		}else if(a==b||a==c||b==c) {
			System.out.println("Triângulo Escaleno");
		}else {
			System.out.println("Triângulo Isósceles");
		}
		
		
		ler.close();
	}

}
