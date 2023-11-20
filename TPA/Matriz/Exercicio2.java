import java.util.Random;

public class Exercicio2 {
	public static void main(String[] args) {
		int a[][] = new int [3][3];
				
		
		final int TAM = 2;
		Random in = new Random();
		
		int maiorp[], menorp[];
		
		int menor, maior;
		
		maiorp = new int [TAM];
		menorp = new int [TAM];
		
		for(int i=0; i<a.length; i++) {
			for(int j=0;j<a.length;j++) {
				a[i][j] = in.nextInt(90)+10;
			}
		}
		
		maior = a [0][0];
		menor = a [0][0];
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i][j]>maior) {
					maior = a[i][j];
					maiorp [0] = i;
					maiorp [1] = j;
				}else if(a[i][j]<menor) {
					menor = a[i][j];
					menorp [0] = i;
					menorp [1] = j;
				}
			}
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.println();
			for(int j=0;j<a.length;j++) {
				System.out.print(" [ "+ a[i][j]+" ] ");
			}
		}
		
		System.out.println("\n\nMaior = "+maior+"\nposiçao: "+maiorp[0]+","+maiorp[1]);
		System.out.println("\nMenor = "+menor+"\nposiçao: "+menorp[0]+","+menorp[1]);
		
	}
}
