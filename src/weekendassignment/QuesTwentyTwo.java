package weekendassignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class QuesTwentyTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<Integer,String> hmap = new HashMap<>(n);
		ArrayList<String> alist = new ArrayList<String>(); 
		for(int i=0;i<n;i++){
			int key = sc.nextInt();
			String value = sc.next();
			hmap.put(key, value);
		}
		alist = getName(hmap);
		for (String string : alist) {
			System.out.println(string);
		}
		
	}

	static ArrayList<String> getName(HashMap<Integer, String> hmap) {
		// TODO Auto-generated method stub
		ArrayList<String> alist = new ArrayList<String>();
		for (Entry<Integer, String> row : hmap.entrySet()) {
			String name = row.getValue();
			//System.out.println(name);
			if(Character.isLowerCase(name.charAt(0)) && Character.isUpperCase(name.charAt(name.length()-1)) && name.matches("(.)*[0-9]+(.)*")){
				alist.add(name);	
			}
		}
		return alist;
	}

}
