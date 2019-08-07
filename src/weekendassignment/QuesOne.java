package weekendassignment;

import java.util.Scanner;

public class QuesOne {
	
	static String replacePlus(String s1,String s2){
		for (int i=0;i<s1.length();i++) {
			char ch = s1.toLowerCase().charAt(i);
			if(!s2.toLowerCase().contains(Character.toString(ch))){
				s1 = s1.replace(s1.charAt(i), '+');
			}
		}
		return s1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="",s2="";
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter String 1:");
		s1 = sc.next();
		//System.out.println("Enter String 2:");
		s2 = sc.next();
		System.out.println(replacePlus(s1,s2));
	}
}
