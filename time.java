import java.text.BreakIterator;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

import javax.swing.text.AbstractDocument.BranchElement;

public class time {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		 Date date1 = new Date();
		   System.out.println("������� ���� : "+(1900+date1.getYear())+"/"+(1+date1.getMonth())+"/"+date1.getDay()+" ������ "+date1.getHours()+":"+date1.getMinutes()+":"+date1.getSeconds());

		Scanner scan = new Scanner(System.in);           
		int y = scan.nextInt();
		
		int m = scan.nextInt();
		int d = scan.nextInt();
		int h = scan.nextInt();
		if (m>12) {
			System.out.println("̳���� �� ���� ���� >12");
		}
		if (h>24) {
			System.out.println("� ��� �� ���� ���� "+h+" �����");
			System.exit(1);
		}

		
		LocalDate today = LocalDate.now();                          //Today's date
		LocalDate birthday = LocalDate.of(y, m, d);  //Birth date
		 
		Period p = Period.between(birthday, today);
		//Now access the values as below
		
		   if (h>(-h+date1.getHours())) {
			   System.out.println("��� �����������  "+(p.getYears())+" ���� "+(p.getMonths())+" ����� "+(-1+p.getDays())+" ��� "+(h)+" ����� "+date1.getMinutes()+" ������ "+date1.getSeconds()+" � ������");
		} 
		   
		   else {
			   System.out.println("��� �����������  "+(p.getYears())+" ���� "+(p.getMonths())+" ����� "+p.getDays()+" ��� "+(-h+date1.getHours())+" ����� "+date1.getMinutes()+" ������ "+date1.getSeconds()+" � ������");
		}
		   
		   

 	

	
	}

}
