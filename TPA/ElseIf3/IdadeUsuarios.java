import java.util.Scanner;

public class IdadeUsuarios {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String nomevelho, nomenovo, nome;
        int idadevelho, idadenovo, idade;

        System.out.println("Insira o nome do primeiro usuario:");
        nome = leia.next();
        System.out.println("Insira a Idade do primeiro usuario:");
        idade = leia.nextInt();
        nomevelho = nome;
        nomenovo = nome;
        idadevelho = idade;
        idadenovo = idade;
        System.out.println("Insira o nome do segundo usuario:");
        nome = leia.next();
        System.out.println("Insira a idade do segundo usuario:");
        idade = leia.nextInt();
        if (idade > idadevelho) {
            nomevelho = nome;
            idadevelho = idade;
        } else if (idade < idadenovo) {
            nomenovo = nome;
            idadenovo = idade;
        }
        System.out.println("Insira o nome do terceiro usuario:");
        nome = leia.next();
        System.out.println("Insira a idade do terceiro usuario:");
        idade = leia.nextInt();
        if (idade > idadevelho) {
            nomevelho = nome;
            idadevelho = idade;
        } else if (idade < idadenovo) {
            nomenovo = nome;
            idadenovo = idade;
        }
        System.out.println("Insira o nome do quarto usuario:");
        nome = leia.next();
        System.out.println("Insira a idade do quarto usuario:");
        idade = leia.nextInt();
        if (idade > idadevelho) {
            nomevelho = nome;
            idadevelho = idade;
        } else if (idade < idadenovo) {
            nomenovo = nome;
            idadenovo = idade;
        }
        System.out.println("Insira o nome do quinto usuario:");
        nome = leia.next();
        System.out.println("Insira a idade do quinto usuario:");
        idade = leia.nextInt();
        if (idade > idadevelho) {
            nomevelho = nome;
            idadevelho = idade;
        } else if (idade < idadenovo) {
            nomenovo = nome;
            idadenovo = idade;
        }
        System.out.println("O mais velho tem " + idadevelho + " e se chama " + nomevelho);
        System.out.println("O mais novo tem " + idadenovo + " e se chama " + nomenovo);

        leia.close();
    }

}