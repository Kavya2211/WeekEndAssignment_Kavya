package weekendassignment;

import java.util.Scanner;

public class QuesNineteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String sent = sc.nextLine();
		System.out.println(getLastLetter(sent));
	}

	static String getLastLetter(String sent) {
		// TODO Auto-generated method stub'
		String result = "";
		String words[] = sent.split(" ");
		for (String str : words) {
			char letters[] = str.toCharArray();
			result+=letters[letters.length-1];
			result+="$";
		}
		result = result.substring(0,result.length()-1);
		return result;
	}

}
