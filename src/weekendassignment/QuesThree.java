package weekendassignment;

import java.util.Scanner;

public class QuesThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="",s2="";
		int count=0;
		Scanner sc = new Scanner(System.in);
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		String[] sent1= s1.split(" ");
		String[] sent2 = s2.split(" ");
		/*for (String string : sent2) {
			System.out.println(string);
		}*/
		for (String string : sent1) {
			if(string.equals(sent2[1]))
				count++;
		}
		System.out.println(count);

	}

}
