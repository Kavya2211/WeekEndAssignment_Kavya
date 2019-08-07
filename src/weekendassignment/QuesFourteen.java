package weekendassignment;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuesFourteen {
	static boolean validatePassword(String password) 
	{
	    if(password.length()>=8)
	    {
	        Pattern letter = Pattern.compile("[a-zA-z]");
	        Pattern digit = Pattern.compile("[0-9]");
	        Pattern special = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
	        Matcher hasLetter = letter.matcher(password);
	        Matcher hasDigit = digit.matcher(password);
	        Matcher hasSpecial = special.matcher(password);
	        return hasLetter.find() && hasDigit.find() && hasSpecial.find();
	    }
	    else
	        return false;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String pwd = sc.nextLine();
		if(validatePassword(pwd))
			System.out.println("Valid");
		else System.out.println("InValid");
	}

}
