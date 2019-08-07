package weekendassignment;

import java.util.Scanner;

public class QuesThirtyThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String binary,octal,hex;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the binary Number:");
		binary = sc.next();
		System.out.println("Enter the Octal Number:");
		octal = sc.next();
		System.out.println("Enter the Hexadecimal Number:");
		hex = sc.next();
		System.out.println("The integer value of the binary number "+binary+" is "+Integer.parseInt(binary, 2) );
		System.out.println("The integer value of the Octal number "+octal+" is "+Integer.parseInt(octal, 8) );
		System.out.println("The integer value of the Hexadecimal number "+hex+" is "+Integer.parseInt(hex, 16) );
	}

}
