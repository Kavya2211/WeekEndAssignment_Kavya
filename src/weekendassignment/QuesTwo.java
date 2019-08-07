package weekendassignment;

import java.util.Arrays;
import java.util.Scanner;

public class QuesTwo {
	
	static int addUniqueEven(int arr[],int len){
		int sum=0,count=0;
		for(int i=0;i<len;i++){
			if(arr[i]%2==0)
			{	sum+=arr[i];
			    count++;
			}
		}
		if(count==0) return -1; else return sum;
	
	}
	static int removeDuplicates(int arr[]){
		int j=0;
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]!=arr[i+1])
				arr[j++]=arr[i];
		}
		arr[j++]=arr[arr.length-1];
		return j;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int arr[] = new int[len];
		for(int i=0;i<len;i++)
		{
			arr[i] = sc.nextInt();
		}
        len = removeDuplicates(arr);
        int sum=addUniqueEven(arr,len); 
        if(sum==-1) System.out.println("no even numbers");
        else System.out.println(sum);
	}

}
