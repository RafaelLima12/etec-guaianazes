//exercicio 6

public class Exc6 {
	public static void main(String[] args) {
		
		final int TAM = 11;
		
		int a[];
		
		a = new int [TAM];
		
		for(int i = 0; i<TAM; i++) {
			a[i] = (int) Math.pow(2, i);
		}
		for (int i = 0; i<TAM; i++) {
			System.out.println("a["+i+"] = "+a[i]);
		}
    }
}
