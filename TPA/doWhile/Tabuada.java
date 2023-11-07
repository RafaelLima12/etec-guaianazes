
public class Tabuada {
	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			System.out.println("");
			System.out.println("Tabuada do "+i);
			for(int j=1; j<=10; j++) {
				int r = j*i;
				System.out.println(i+"*"+j+"="+r);
			}
		}
	}
}
