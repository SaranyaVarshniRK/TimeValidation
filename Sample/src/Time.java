

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Time {
	
	public static void main(String args[])
	{
		
		System.out.println("To get the desired time form current time.Parameters passed:(no. of hours, no. of minutes)\n");
		String currentDateCurrentTimePlusFiveHours = getCurrentTimePlusMinutes(0,30);
		System.out.println(currentDateCurrentTimePlusFiveHours);
	}
	
	
		public static String getCurrentTimePlusMinutes(int hours, int minutes) 
		{
			DateFormat dateformat = new SimpleDateFormat("HH:mm a");
			Calendar cal = Calendar.getInstance();
			cal.add(Calendar.HOUR_OF_DAY, hours);	
			cal.add(Calendar.MINUTE, minutes);
			String result = dateformat.format(cal.getTime());
			return result;
		}


	
}
