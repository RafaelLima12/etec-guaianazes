import java.util.Scanner;

public class FaixaEtaria {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i=1, id, primeira=0, segunda=0, terceira=0, quarta=0, quinta=0;
		
		while(i<=15) {
			System.out.println("Digite a idade da "+i+"° pessoa");		
			id = ler.nextInt();
			
			if(id<=15) {
				primeira+=1;
			}else if(id<=30) {
				segunda+=1;
			}else if(id<=45) {
				terceira+=1;
			}else if(id<=60) {
				quarta+=1;	
			}else {
				quinta+=1;
			}	
			i++;
		}
		
		System.out.println(primeira+" pessoas sao da 1° faixa, "+segunda+" pessoas sao da 2° faixa, "+terceira+" pessoas sao da 3° faixa, "+quarta+" pessoas sao da 4° faixa e "+quinta+" pessoas sao da 5° faixa");
		
		primeira = primeira*100/15;
		segunda = segunda*100/15;
		terceira = terceira*100/15;
		quarta = quarta*100/15;
		quinta = quinta*100/15;
		
		System.out.println("1°faixa "+primeira+"%");
		System.out.println("2°faixa "+segunda+"%");
		System.out.println("3°faixa "+terceira+"%");
		System.out.println("4°faixa "+quarta+"%");
		System.out.println("5°faixa "+quinta+"%");
	ler.close();
	}

}
