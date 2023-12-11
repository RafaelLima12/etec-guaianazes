import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int a[] = new int [10];
		
		for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i + 1) + "° valor: ");
            a[i] = ler.nextInt();
        }
		
		System.out.println("Qual número deseja buscar?");
		int n = ler.nextInt();
		
		for (int i = 0; i < 10; i++) {
            if(a[i] == n) {
            	System.out.println("O número "+n+" esta na "+i+"° posição do vetor");
            	return;
            }
        }
		
		System.out.println("O número "+n+" não foi encontrado");
		
		ler.close();
	}
}
