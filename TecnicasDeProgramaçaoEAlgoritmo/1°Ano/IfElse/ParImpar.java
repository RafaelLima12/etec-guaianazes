import java.util.Scanner;

public class ParImpar {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n;
		
		System.out.println("Digite um Número: ");
		n = ler.nextInt();
		
		if(n%2==0) {
			System.out.println("Seu número é Par");
		}else{
			System.out.println("Seu número é Impar");
			
		}
		ler.close();
	}
}