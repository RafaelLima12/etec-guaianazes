
public class MediaAritmetica {
	public static void main(String[] args) {
		int j=0, r=13;
		for(int i=13; i<=73; i++, j++) {
			r+=i;
		}
		r/=j;
		System.out.println("Media = "+r);
	}
}
