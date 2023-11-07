
public class Anobissexto {
	public static void main(String[] args) {
		int c, d;
		
		for(int i=1;i<=2023;i++) {
			System.out.println(i);
			c = i % 4;
			d = i % 100;
			if(c == 0 && d != 0)
			System.out.println(i+" ano bissexto");
		}
	}

}
