
public class SumarneVidh8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mas[][]=new int[5][5];
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas.length; j++) {
				mas[i][j]= (int) (Math.random()*200-100);
			}
		}
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas.length; j++) {
				System.out.print("  "+mas[i][j]+"   ");
			}
			System.out.println();
		}
		
		int max=mas[0][0];
		int r=0,q=0;
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas.length; j++) {
				if (max<mas[i][j]) {
					max=mas[i][j];
				}
			}
		}
		int sum=0;
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {	
			
					sum=sum+(max-mas[i][j]);
			}
			System.out.println( "Сумарне відхилення "+(i+1)+"-го рядка = "+sum);
			sum = 0;

		}
		System.out.println();
		System.out.println("Максимальне число ="+max);

	}

}
