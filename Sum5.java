
public class Sum5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mas[]=new int[20];
		
		for (int i = 0; i < mas.length; i++) {
			mas[i]=(int) (Math.random()*200-100);
		}
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i]+"  ");
		}
		int sum=0;
		for (int i = 0; i < mas.length; i++) {
			if(mas[i]%2 !=0 ) {
				sum+=mas[i];
			}
		}
		System.out.println();
		System.out.println("Сума непарних чисел = "+ sum);
	}

}
