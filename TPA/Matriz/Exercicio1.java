
public class Exercicio1 {
	public static void main(String[] args) {
		int i=0;
		int a[][] = new int [4][4];
		
		int b = 1;
		
		for(i=0;i<a.length;i++) 
		{
			for(int j=0;j<a.length;j++) {
				b = b*2;
				a[i][j] = b;
			}
		}
		
		for(i=0;i<4;i++) 
		{
			System.out.println();
			for(int j=0;j<4;j++) {
				System.out.print(" [ "+ a[i][j]+" ] ");
			}
		}
	}

}
