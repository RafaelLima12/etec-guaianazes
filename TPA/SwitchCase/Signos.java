import java.util.Scanner;

public class Signos {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		int m,d;
		
		System.out.println("Digite o mes do seu nascimento: ");
		m = ler.nextInt();
		if (m<1 || m>12) {
			System.out.println("Mês invalido");
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
				System.out.println("áries");
			}
			break;
			
		case 4:
			if (d<=20) {
				System.out.println("áries");
			}else {
				System.out.println("Touro");
			}
			break;
			
		case 5:
			if(d<=20) {
				System.out.println("Touro");
			}else {
				System.out.println("Gêmeos");
			}
			break;
			
		case 6:
			if(d<=20) {
				System.out.println("Gêmeos");
			}else {
				System.out.println("Cancer");
			}
			break;
			
		case 7:
			if(d<=22) {
				System.out.println("Cancer");
			}else {
				System.out.println("Leão");
			}
			break;
			
		case 8:
			if(d<=23) {
				System.out.println("Leão");
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
				System.out.println("Escorpião");
			}
			break;
			
		case 11:
			if(d<=21) {
				System.out.println("Escorpião");
			}else {
				System.out.println("Sagitário");
			}
			break;
			
		case 12:
			if(d<=21) {
				System.out.println("Sagitário");
			}else {
				System.out.println("Capricórnio");
			}
			break;
		case 1:
			if(d<=20) {
				System.out.println("Capricórnio");
			}else {
				System.out.println("Aquário");
			}
			break;
			
		case 2:
			if (d<=18) {
				System.out.println("Aquário");
			}else {
				System.out.println("peixes");
			}
		}
		ler.close();
	}
}

