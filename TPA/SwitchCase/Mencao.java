import java.util.Scanner;

public class Mencao {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int mb, b, r, i, total;
		double p;
		String n;

		System.out.println("Digite a quantidade de alunos que tiraram MB");
		mb = ler.nextInt();
		
		System.out.println("Digite a quantidade de alunos que tiraram B");
		b = ler.nextInt();
		
		System.out.println("Digite a quantidade de alunos que tiraram R");
		r = ler.nextInt();
		
		System.out.println("Digite a quantidade de alunos que tiraram I");
		i = ler.nextInt();
		
		total = mb+b+r+i;
		
		System.out.println("De qual nota você deseja ver a porcentagem?");
		n = ler.next();
		
		switch(n) {
		case "mb":
			p = mb*100/total;
			System.out.println(p+"% dos alunos tiraram MB");
			break;
			
		case "b":
			p = b*100/total;
			System.out.println(p+"% dos alunos tiraram B");
			break;
			
		case "r":
			p = r*100/total;
			System.out.println(p+"% dos alunos tiraram R");
			break;
			
		case "i":
			p = i*100/total;
			System.out.println(p+"% dos alunos tiraram i");
			break;
			
			default:
				System.out.println("Menção inválida");
		}
		ler.close();
	}
}
