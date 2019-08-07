package weekendassignment;

import java.util.Arrays;
import java.util.Scanner;

public class QuesSix {
	
	static boolean getAnagram(String s1,String s2){
		if(s1.length()!=s2.length()) return false;
		char temp[] = s1.toLowerCase().toCharArray();
		Arrays.sort(temp);
		s1 = new String(temp);
		temp= s2.toLowerCase().toCharArray();
		Arrays.sort(temp);
		s2 = new String(temp);
		if(s1.equalsIgnoreCase(s2))
			return true;
		else return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			String s1="",s2="";
			s1 = sc.nextLine();
			s2 = sc.nextLine();
			if(getAnagram(s1,s2)) System.out.println("Anagram");
			else System.out.println("Not Anagram");
	}

}
