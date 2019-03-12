
public class SumMAX_MIN6 {

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
		int max=mas[0][0],min=mas[0][0];
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas.length; j++) {
				if (min>mas[i][j]) {
					min=mas[i][j];
				}
				else if(max<mas[i][j])
				{
					max=mas[i][j];
				}
			}
			
		}
		System.out.println();
		System.out.println("Максимальний елемент = "+max);
		System.out.println("Мінімальний елемент = "+min);
		int sum=max+min;
		System.out.println("Сума максимального та мінімального ="+sum);
	}

}
