import java.util.Scanner;

public class Idade {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int an, at, id, resposta;
		
		
		
		do {
			System.out.println("Escreva o ano de seu nascimento:");
			an = ler.nextInt();
			
			System.out.println("Escreva o ano atual:");
			at = ler.nextInt();
			
			id= at-an;
			
			System.out.println("Voc� tem "+id+" anos");
			
			if(id>=18) {
				System.out.println("Voc� � maior de idade");
			}else {
				System.out.println("Voc� � menor de idade");
			}
			
			System.out.println("Deseja Continuar? ('1' para sim e '2' para n�o)");
			resposta=ler.nextInt();
			
		}while(resposta==1);
		ler.close();
	}
		
}
