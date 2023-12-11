import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int a[] = new int[10];
        int b[] = new int[10];
        int c[] = new int[10];

        for (int i = 0; i < a.length; i++) {
            System.out.println("Digite o "+(i+1)+"° valor de A");
            a[i] = ler.nextInt();
        }

        for (int i = 0; i < b.length; i++) {
            System.out.println("Digite o "+(i+1)+"° valor de B");
            b[i] = ler.nextInt();

            for (int j = 0; j < a.length; j++) {
                if (a[j] == b[i]) {
                    c[i] = a[j];
                }
            }
        }
        
        System.out.print("C = [");
        for (int i = 0; i < c.length; i++) {
            if(c[i] != 0) {
            	System.out.print(c[i] + " ");
            }
        }
        System.out.print("]");

        ler.close();
    }
}
