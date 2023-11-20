import java.util.Random;

public class Exercicio3 {
	public static void main(String[] args) {
		Random in = new Random();
		
		int a[][] = new int[3][4];
		
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<4; j++) {
				a[i][j] = in.nextInt()%100;
			}
		}
		
		for(int i = 0; i<3; i++) {
			int b=0;
			for(int j = 0; j<3; j++) {
				b = b+a[i][j];
				a[i][3] = b;
			}
		}
		
		for(int i = 0; i<3; i++) {
			System.out.println();
			for(int j = 0; j<4; j++) {
				System.out.print(" ["+a[i][j]+"] ");
			}
		}
		
	}
}
