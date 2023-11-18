//exercicio 10

import java.util.Scanner;

public class Diferenca {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int a[] = new int[10];
        
        int b[] = new int[10];
        
        int c[] = new int[10];
        
        int d = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i + 1) + "° número de A");
            a[i] = ler.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i + 1) + "° número de B");
            b[i] = ler.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            int j;
            for (j = 0; j < 10; j++) {
                if (a[i] == b[j]) {
                    break;
                }
            }

            if (j == 10) {
                c[d] = a[i];
                d++;
            }
        }

        System.out.print("\nDiferença:\nC[");
        for (int i = 0; i < d; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.print("]");
    }
}



