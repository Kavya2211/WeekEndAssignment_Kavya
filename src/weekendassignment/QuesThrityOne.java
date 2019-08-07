package weekendassignment;

import java.util.Scanner;

public class QuesThrityOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double x,y,z,cp,gain,profit;
		System.out.println("Enter the number of dozens of toys purchased:");
		x = sc.nextDouble();
		System.out.println("Enter the price per dozen:");
		y = sc.nextDouble();
		System.out.println("Enter the selling price of 1 toy");
		z = sc.nextDouble();
		cp = y/12;
		gain = (z-cp);
		profit = Math.abs(gain)/cp*100;
		profit = Math.round(profit*100);
		if(gain<0){
			System.out.println("Sam's loss percentage is "+profit/100+" percent");
		}
		else System.out.println("Sam's profit percentage is "+profit/100+" percent");
		
	}

}
