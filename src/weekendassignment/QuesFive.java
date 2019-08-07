package weekendassignment;

import java.util.*;

public class QuesFive {
	static int getAverageOfOdd(HashMap<Integer,Integer> map){
		int avg=0,count=0;
		for (HashMap.Entry<Integer,Integer> e : map.entrySet()) {
			if(e.getKey()%2!=0){
				count++;
				avg+=e.getValue();
			}
		}
		if(count==0) return 0;
		else return avg/count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int key,value,len,avg;
		HashMap<Integer,Integer> map = new HashMap<>();
		len = sc.nextInt();
		for(int i=0;i<len;i++){
			key = sc.nextInt();
			value = sc.nextInt();
			map.put(key, value);
		}
		System.out.println(getAverageOfOdd(map));	
	}
}
