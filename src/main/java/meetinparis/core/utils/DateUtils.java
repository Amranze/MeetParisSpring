package meetinparis.core.utils;

import java.util.Date;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Hours;
import org.joda.time.Months;
import org.joda.time.Years;

public class DateUtils {
	//TODO check days like if we have 154 
	public Date convertLongToDate(long timestamp){
		return new Date(timestamp);
	}
	public int getHours(Date now, Date before){
		return Hours.hoursBetween(new DateTime(before), new DateTime(now)).getHours();
	}
	public int getDays(Date now, Date before){
		return Days.daysBetween(new DateTime(before), new DateTime(now)).getDays();
	}
	public int getMonths(Date now, Date before){
		return Months.monthsBetween(new DateTime(before), new DateTime(now)).getMonths();
	}
	public int getYears(Date now, Date before){
		return Years.yearsBetween(new DateTime(before), new DateTime(now)).getYears();
	}
	public String compareDates(Date now, Date before){
		int hours = getHours(now, before);
		if(hours < 24)
			return hours + " Hours";
		else {
			int days = getDays(now, before);
			if(days < 31)
				return days + " Days";
			else{
				int months = getMonths(now, before);
				if(months < 12)
					return months +" Months";
				else {
					return getYears(now, before)+" Years";
				}
			}
		}
	}
}
