package meetinparis.test.repository;

import java.util.Date;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Hours;
import org.joda.time.Months;

import meetinparis.core.utils.DateUtils;

public class TestApp {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Date past = new Date(110, 5, 20); // June 20th, 2010
		Date today = new Date(117, 0, 1); // July 24th 
		//today.setYear(2017);
		Date now = new Date();
		
		DateUtils utils = new DateUtils();
		int days = Days.daysBetween(new DateTime(today), new DateTime(now)).getDays(); // => 34
		int hours = Hours.hoursBetween(new DateTime(today), new DateTime(now)).getHours();
		int months = Months.monthsBetween(new DateTime(today), new DateTime(now)).getMonths();
		System.out.println("hours : "+hours+" Days : " +days+ " Months "+ months);
		System.out.println("TOday " + today);
		System.out.println("Now " + now);
		System.out.println(utils.compareDates(now, today));		
		
		/*System.out.println(utils.compareDates(now, before));
		System.out.println("Before : " +before);		
		
		System.out.println("Now : " +now);		
		System.out.println("Now Long :" +nowLong);
		System.out.println("Now Conversion: "+new Date(nowLong));

		System.out.println(utils.compares(nowLong, beforeLong));*/

	}

}
