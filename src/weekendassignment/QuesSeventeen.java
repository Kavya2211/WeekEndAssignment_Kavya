package weekendassignment;

import java.util.Scanner;

public class QuesSeventeen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int arr[] = new int[len];
		for(int i=0;i<len;i++){ 
			arr[i] = sc.nextInt();
		}
		System.out.println(findMaxDifference(arr));
	}

	static int findMaxDifference(int[] arr) {
		// TODO Auto-generated method stub
		int maxdiff = 0,index=-1;
		for(int i=0;i<arr.length-1;i++){
			int diff = Math.abs(arr[i+1]-arr[i]);
			if(diff>maxdiff){
				maxdiff = diff;
				index=arr[i]>arr[i+1]?i:i+1;
			}
		}
		return index;
	}

}
