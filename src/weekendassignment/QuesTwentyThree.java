package weekendassignment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class QuesTwentyThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		System.out.println(convertDateFormat(input));

	}

	static String convertDateFormat(String input) {
		// TODO Auto-generated method stub
		String destdate="";
		SimpleDateFormat srcdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat destdf = new SimpleDateFormat("dd-MM-yy");
		try {
			Date srcdate = srcdf.parse(input);
			destdate = destdf.format(srcdate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return destdate;
	}

}
