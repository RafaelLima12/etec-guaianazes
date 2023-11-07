//exercicio 4
public class Pares {
	public static void main(String[] args) {
		int[] a = {3, 5, 7, 9, 11, 13, 15, 17, 19, 21};

        int i = 0;
        for (int elemento : a) {
            System.out.println("\nElemento " + (i+1) + ": " + elemento);
            System.out.print("Pares de 0 até " + a[i] + ": ");
            
            for (int j = 0; j <= elemento; j++) {
                if (j % 2 == 0) {
                    System.out.print(j + " ");
                }
            }
            
            System.out.println();
            i++;
        }
    }
}

