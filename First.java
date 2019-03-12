
public class First {

	public static void main(String[] args) {
		
		int f=1;
		
		for (int i = 1; i < 10; i++) {
			f=f*i;
		}
		System.out.println(f);
		int s = 0, ff=1,ii=1;
		while (ii < 10) {
			ff = ff*ii;
			ii++;
		}
		System.out.println(ff);
		 ff = 1;
		 ii = 1;
		do {
			
			ff=ff*ii;
			ii++;
		} while (ii < 10);
		
		System.out.println(ff);
	}

}
