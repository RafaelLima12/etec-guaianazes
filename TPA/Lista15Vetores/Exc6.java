//exercicio 6

public class Exc6 {
	public static void main(String[] args) {
		
		final int TAM = 11;
		
		int a[];
		
		a = new int [TAM];
		
		for(int i = 0; i<TAM; i++) {
			int r = 1;
			for(int j = 0; j<i; j++) {
				r = r*2;
			}
			a[i] = r;
		}
		for (int i = 0; i<TAM; i++) {
			System.out.println("a["+i+"] = "+a[i]);
		}
    }
}
