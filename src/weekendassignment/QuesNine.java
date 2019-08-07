package weekendassignment;

import java.util.Scanner;

public class QuesNine {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String sent = sc.nextLine();
		System.out.println(storeMaxVowelWord(sent));
	}

	static String storeMaxVowelWord(String sent) {
		// TODO Auto-generated method stub
		String arr[] = sent.split(" ");
		String check = "aeiou";
		String result="";
		int maxcount=0;
		for (String string : arr) {
			int count=0;
			char temp[] = string.toCharArray();
			for (char c : temp) {
				if(check.contains(Character.toString(c).toLowerCase()))
					count++;
			}
			if(count>maxcount){
				//System.out.println(string+" "+count);
				maxcount= count;
				result = string;
			}
		}
		
		return result;
	}

}
