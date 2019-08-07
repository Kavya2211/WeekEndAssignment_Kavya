package weekendassignment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class QuesSixteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String date1,date2;
		date1 = sc.next();
		date2 = sc.next();
		System.out.println(findOldDate(date1,date2));
	}

	static String findOldDate(String date1, String date2) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		SimpleDateFormat newsdf = new SimpleDateFormat("MM/dd/yyyy");
		String older = null;
		try {
			Date d1 = sdf.parse(date1);
			Date d2 = sdf.parse(date2);
			if(d1.before(d2)){
				older = newsdf.format(d1);}
			else{
				older = newsdf.format(d2);
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return older.toString();
	}

}
