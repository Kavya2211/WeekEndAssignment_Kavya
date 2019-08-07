package weekendassignment;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class QuesTwentyOne {
	static String getDay(String givenDate){
		String dayName="";
		SimpleDateFormat format =  new SimpleDateFormat("MM-dd-yyyy");
		try {
			Date date = format.parse(givenDate);
			Calendar c = Calendar.getInstance();
			c.setTime(date);
			int dayofWeek= c.get(Calendar.DAY_OF_WEEK);
			switch (dayofWeek) {
			case 1:
				dayName = "Sunday";
				break;
			case 2:
				dayName = "Monday";
				break;
			case 3:
				dayName = "Tuesday";
				break;
			case 4:
				dayName = "Wednesday";
				break;
			case 5:
				dayName = "Thursday";
				break;
			case 6:
				dayName = "Friday";
				break;
			case 7:
				dayName = "Saturday";
				break;
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dayName;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String givenDate = sc.next();
		System.out.println(getDay(givenDate));
		
	}

}
