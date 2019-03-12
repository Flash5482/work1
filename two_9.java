


public class two_9 
 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
		int n=15;
		int mas[]=new int[n];
		for (int i = 0; i <n; i++) {
			mas[i]=(int)(Math.random()*200-100);
		}
		for (int i = 0; i < n; i++) {
			System.out.print("  "+mas[i]);
		}
		int mas2[]=shiftarrey(mas, 4);
		System.out.println();
		for (int i = 0; i < mas2.length; i++) {
			System.out.print("  "+mas2[i]);
		}
	}
	
	public static int[] shiftarrey(int[] mas, int j){
		int mas2[]=new int[ mas.length];
		
		int k = 0;
		
		
		for (int i = j; i < mas2.length ; i++) {
			mas2[k] = mas[i];
			k++;
		}
		
		for (int i = 0; i<j; i++) {
			mas2[k] = mas[i];
			k++;
		}
		
		
		
		
		return mas2;
	}
}

		

