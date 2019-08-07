package weekendassignment;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class QuesTwenty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<Integer,String> hmap = new HashMap<>(n);
		for(int i=0;i<n;i++){
			int key = sc.nextInt();
			String value = sc.next();
			hmap.put(key, value);
		}
		System.out.println(getMaxKeyValue(hmap));
	}

	static String getMaxKeyValue(HashMap<Integer, String> hmap) {
		// TODO Auto-generated method stub
		int maxkey=0;
		String maxvalue="";
		for (Entry<Integer, String> curr : hmap.entrySet()) {
			if(curr.getKey()>maxkey){
				maxkey = curr.getKey();
				maxvalue = curr.getValue();
			}
		}
		return maxvalue;
	}

}
