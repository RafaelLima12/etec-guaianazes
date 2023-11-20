import java.util.Scanner;

public class Clima {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double f, c;
		
		System.out.println("Escreva a temperatura em fahrenheit: ");
		f = ler.nextDouble();
		
		c = (f-32)*5/9;
		System.out.println("A temperatura em Celcius est� "+c+"�C");
		
		if (c<15) {
			System.out.println("Est� frio");
			
		}else if(c>=22) {
			System.out.println("Est� calor");
			
		}else {
			System.out.println("A temperatura est� amena");
		}
		ler.close();
	}
}
