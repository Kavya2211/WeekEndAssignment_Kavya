package weekendassignment;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.YearMonth;
import java.util.*;
public class QuesTwentyFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String date = sc.next();
		
		Date convertedDate;
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
			convertedDate = dateFormat.parse(date);
			Calendar c = Calendar.getInstance();
			c.setTime(convertedDate);
			int month = c.get(Calendar.MONTH);
			int year = c.get(Calendar.YEAR);
			//System.out.println(year+" "+(month+1));
			YearMonth yearMonthObject =YearMonth.of(year,month+1);
			int daysInMonth = yearMonthObject.lengthOfMonth(); 
			System.out.println(daysInMonth);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
