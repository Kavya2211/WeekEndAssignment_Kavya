package weekendassignment;

import java.util.ArrayList;
import java.util.Scanner;

public class QuesEleven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		ArrayList <String> alist = new ArrayList<String>();
		for(int i=0;i<n;i++){
			String temp = sc.nextLine();
			alist.add(temp);
		}
		System.out.println(highestScorer(alist));
		

	}

	static String highestScorer(ArrayList<String> alist) {
		// TODO Auto-generated method stub
		String maxname = ""; 
		int max_score=0;
		for (String row : alist) {
			String marks[] = row.split("-");
			int score = Integer.parseInt(marks[1])+Integer.parseInt(marks[2])+Integer.parseInt(marks[3]);
		    if(score>max_score){
		    	maxname = marks[0];
		    	max_score = score;
		    }
		}
		return maxname;
	}

}
