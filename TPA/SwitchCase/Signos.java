import java.util.Scanner;

public class Signos {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		int m,d;
		
		System.out.println("Digite o mes do seu nascimento: ");
		m = ler.nextInt();
		if (m<1 || m>12) {
			System.out.println("M�s invalido");
			ler.close();
			return;
		}
		
		System.out.println("Digite o dia do seu nascimento: ");
		d = ler.nextInt();
		
		switch(m) {
		case 3:
			if (d<=20) {
				System.out.println("peixes");
			}else {
				System.out.println("�ries");
			}
			break;
			
		case 4:
			if (d<=20) {
				System.out.println("�ries");
			}else {
				System.out.println("Touro");
			}
			break;
			
		case 5:
			if(d<=20) {
				System.out.println("Touro");
			}else {
				System.out.println("G�meos");
			}
			break;
			
		case 6:
			if(d<=20) {
				System.out.println("G�meos");
			}else {
				System.out.println("Cancer");
			}
			break;
			
		case 7:
			if(d<=22) {
				System.out.println("Cancer");
			}else {
				System.out.println("Le�o");
			}
			break;
			
		case 8:
			if(d<=23) {
				System.out.println("Le�o");
			}else {
				System.out.println("Virgem");
			}
			break;
			
		case 9:
			if(d<=22) {
				System.out.println("Virgem");
			}else {
				System.out.println("Libra");
			}
			break;
			
		case 10:
			if(d<=22) {
				System.out.println("Libra");
			}else {
				System.out.println("Escorpi�o");
			}
			break;
			
		case 11:
			if(d<=21) {
				System.out.println("Escorpi�o");
			}else {
				System.out.println("Sagit�rio");
			}
			break;
			
		case 12:
			if(d<=21) {
				System.out.println("Sagit�rio");
			}else {
				System.out.println("Capric�rnio");
			}
			break;
		case 1:
			if(d<=20) {
				System.out.println("Capric�rnio");
			}else {
				System.out.println("Aqu�rio");
			}
			break;
			
		case 2:
			if (d<=18) {
				System.out.println("Aqu�rio");
			}else {
				System.out.println("peixes");
			}
		}
		ler.close();
	}
}

