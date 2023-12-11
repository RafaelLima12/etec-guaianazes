import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int a[] = new int [10];
		
		for (int i = 0; i<a.length; i++) {
			System.out.println("Digite o "+(i+1)+"° número");
			a[i] = ler.nextInt();
		}
		
		int b = 0;
		
		int j = 9;
		for(int i = 0; i<a.length; i++) {
			if(a[i] == a[j]) {
				b = b+1;
			}
			
			j--;
		}
		
		if(b==10) {
			System.out.println("O número é um palindromo");
		}else {
			System.out.println("O número não é um palindromo");
		}
		
		ler.close();

	}

}
	

