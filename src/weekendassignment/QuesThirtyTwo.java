package weekendassignment;

import java.util.Scanner;

public class QuesThirtyTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Enter number 1:");
		a=sc.nextInt();
		System.out.println("Enter number 2:");
		b=sc.nextInt();
		
		// Math function
		a= Math.abs(a);
		b= Math.abs(b);
		if(a==b) System.out.println(a+"=="+b);
		else System.out.println(a+"!="+b);
	}

}
