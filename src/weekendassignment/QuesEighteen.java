package weekendassignment;

import java.util.Scanner;
import java.util.regex.Pattern;

public class QuesEighteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String pan = sc.next();
		if(validatePAN(pan)==1) System.out.println("Valid");
		else System.out.println("Invalid");
	}

	static int validatePAN(String pan) {
		// TODO Auto-generated method stub
		if(Pattern.matches("[A-Z]{3}[0-9]{4}[A-z]", pan)) return 1;
		else return 2;
	}

}
