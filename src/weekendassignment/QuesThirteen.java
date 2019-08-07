package weekendassignment;

import java.util.Scanner;

public class QuesThirteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String swapping = sc.nextLine();
		System.out.println(swapPairs(swapping));
			
	}

	static String swapPairs(String swapping) {
		// TODO Auto-generated method stub
		char sb[] = swapping.toCharArray();
		for(int i=0;i<sb.length-1;i+=2){
			char temp = sb[i];
			sb[i] = sb[i+1];
			sb[i+1] = temp;
		}
		return String.valueOf(sb);
	}

}
