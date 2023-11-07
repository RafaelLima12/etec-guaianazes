//exercicio 1

import java.util.Scanner;

public class ParImpar {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
        
        final int TAM = 20;
        
        int par = 0, imp = TAM/2;
        
        int a[];
        a = new int [TAM];
        
        int b[];
        b = new int [TAM];
        
        for(int i = 0; i<TAM; i++) {
        	System.out.println("Digite o "+(i+1)+"° valor: ");
        	a[i] = ler.nextInt();
        	
        	if (a[i]%2==0) {
        		b[par]=a[i];
        		par++;
        	}else if (a[i]%2!=0){
        		b[imp]=a[i];
        		imp++;
        	}
        }
        
        for(int i = 0; i<TAM; i++) {
        	System.out.println(b[i]);
        }
    }
}