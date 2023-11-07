//exercicio 5
public class Divisores {
	public static void main(String[] args) {
		
		int [] a = {2, 4, 6, 9, 10, 12, 15, 16, 18, 20};
		
		for (int i = 0; i<10; i++) {
			System.out.print("\nDivisores de "+a[i]+" =");
			
			for (int j = 1; j<=a[i]; j++) {
				
				if(a[i]%j==0) {
					System.out.print(" "+j);
				}
			}
		}
	}
}
