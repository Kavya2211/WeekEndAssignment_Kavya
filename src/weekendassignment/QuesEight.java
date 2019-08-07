package weekendassignment;

import java.util.Scanner;

public class QuesEight {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(getKaprekarNumber(number)) System.out.println("Kaprekar Number");
		else System.out.println("Not A Kaprekar Number");
		}

	static boolean getKaprekarNumber(int num) {
		// TODO Auto-generated method stub
		int number = num*num;
		String wholenum = Integer.toString(number);
		//System.out.println(wholenum);
		int len = wholenum.length();
		String rightHandPiece="",leftHandPiece="";
		rightHandPiece = wholenum.substring(len/2, len);
		leftHandPiece = wholenum.substring(0,len/2);
		//System.out.println(rightHandPiece);
		//System.out.println(leftHandPiece);
	    int result = Integer.parseInt(leftHandPiece)+Integer.parseInt(rightHandPiece);
	    //System.out.println(result);
	    if(result==num) return true;
	    else return false;
	}

}
