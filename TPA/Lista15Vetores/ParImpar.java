//exercicio 1

import java.util.Scanner;

public class ParImpar {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
        
        int a[] = new int [20];
        
        int b[] = new int [20];
        
        
        int y = 19;
        int x = 0;
        
        for (int i = 0; i<a.length; i++) {
        	System.out.println("Digite o "+(i+1)+"° valor");
        	a[i] = ler.nextInt();
        	
        	if(a[i]%2 == 0) {
        		b[x] = a[i];
        		x++;
        	}else {
        		b[y] = a[i];
        		y--;
        	}
        }
        
        
        System.out.print("\nB[ ");
        for(int i = 0; i<a.length; i++) {
        	System.out.print(b[i]+" ");
        }
        System.out.println("]");
        
    }
}