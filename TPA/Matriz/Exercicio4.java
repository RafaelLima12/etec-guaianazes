import java.util.Scanner;

import java.util.Random;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		Random in = new Random();
		
		int a[][] = new int [4][4];
		
        for(int i = 0; i<a.length; i++) {
        	for(int j = 0; j<a.length; j++) {
        		a[i][j] = in.nextInt(75)+1;
        	}
        }
        
        for(int i = 0; i<4; i++) {
    		System.out.println();
    		for(int j = 0; j<4; j++) {
    			System.out.print(" ["+a[i][j]+"] ");
    		}
    	}
        
        System.out.println("");
        int bingo = 0, n, cont = 1;
        while(bingo != 16) {
        
        	System.out.println("Digite o "+cont+"° número");
    		n = ler.nextInt();
        	for(int i = 0; i<a.length; i++) {
        		
        		for(int j = 0; j<a.length; j++) {
        			if(n == a[i][j]) {
        				System.out.println("Sua cartela tem este número");
        				a[i][j] = 0;
        				bingo = bingo+1;
        			}
        		}
        	}
        	cont++;
        }
        
        System.out.println("Bingo!");
        System.out.println("Você ganhou na "+(cont-1)+"° rodada");
        	
	}
}
