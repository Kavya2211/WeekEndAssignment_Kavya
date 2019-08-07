package weekendassignment;

import java.util.*;
public class QuesFour {

	static ArrayList<Integer> generateOddEvenList(ArrayList<Integer> arr1,ArrayList<Integer> arr2){
		ArrayList<Integer> arr3 = new ArrayList<Integer>(arr1.size());
		for(int i=0;i<arr1.size();i++){
			if(i%2==0) arr3.add(arr2.get(i));
			else arr3.add(arr1.get(i));
		}
		return arr3;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp;
		ArrayList<Integer> arr1 = new ArrayList<Integer>(n);
		ArrayList<Integer> arr2 = new ArrayList<Integer>(n);
		ArrayList<Integer> arr3 = new ArrayList<Integer>(n);
		for(int i=0;i<n;i++){
			temp=sc.nextInt();
			arr1.add(temp);
		}
		for(int i=0;i<n;i++){
			temp=sc.nextInt();
			arr2.add(temp);
		}
		arr3 = generateOddEvenList(arr1,arr2);
		for (Integer val : arr3) {
			System.out.println(val);
		}
	}

}
