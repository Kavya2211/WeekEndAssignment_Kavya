package weekendassignment;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class QuestTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		char symbol;
		Set< Integer> set1 = new HashSet<Integer>(len);
		Set< Integer> set2 = new HashSet<Integer>(len);
		for(int i=0;i<len;i++){
			int temp = sc.nextInt();
			set1.add(temp);
		}
		for(int i=0;i<len;i++){
			int temp = sc.nextInt();
			set2.add(temp);
		}
		symbol = sc.next().charAt(0);
		performSetOperations(set1,set2,symbol);
		
		
	}

	static void performSetOperations(Set<Integer> set1, Set<Integer> set2, char symbol) {
		// TODO Auto-generated method stub
	   Set<Integer> result = new HashSet<Integer>();
	   result=set1;
	   if(symbol=='+') //set union
	   {
		   result.addAll(set2);
	   }
	   else if(symbol == '*') //set Intersection
	   {
		   result.retainAll(set2);
	   }
	   else {
		   result.removeAll(set2);
	   }
	   for (Integer integer : result) {
		System.out.println(integer);
	}
	}

}
