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
		   System.out.println("Поточна дата : "+(1900+date1.getYear())+"/"+(1+date1.getMonth())+"/"+date1.getDay()+" Година "+date1.getHours()+":"+date1.getMinutes()+":"+date1.getSeconds());

		Scanner scan = new Scanner(System.in);           
		int y = scan.nextInt();
		
		int m = scan.nextInt();
		int d = scan.nextInt();
		int h = scan.nextInt();
		if (m>12) {
			System.out.println("Місяць не може бути >12");
		}
		if (h>24) {
			System.out.println("В добі не може бути "+h+" годин");
			System.exit(1);
		}

		
		LocalDate today = LocalDate.now();                          //Today's date
		LocalDate birthday = LocalDate.of(y, m, d);  //Birth date
		 
		Period p = Period.between(birthday, today);
		//Now access the values as below
		
		   if (h>(-h+date1.getHours())) {
			   System.out.println("Вам виповнилося  "+(p.getYears())+" років "+(p.getMonths())+" місяці "+(-1+p.getDays())+" днів "+(h)+" годин "+date1.getMinutes()+" хвилин "+date1.getSeconds()+" і секунд");
		} 
		   
		   else {
			   System.out.println("Вам виповнилося  "+(p.getYears())+" років "+(p.getMonths())+" місяці "+p.getDays()+" днів "+(-h+date1.getHours())+" годин "+date1.getMinutes()+" хвилин "+date1.getSeconds()+" і секунд");
		}
		   
		   

 	

	
	}

}
