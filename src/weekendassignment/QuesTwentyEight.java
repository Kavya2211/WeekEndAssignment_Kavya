package weekendassignment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class Employee{
	String fname,lname,mobile,email,address;
}
public class QuesTwentyEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number of Employees:");
		int n=sc.nextInt();
		ArrayList<Employee> alist = new ArrayList<Employee>(n);
		Comparator<Employee> compareById = (Employee o1, Employee o2) -> o1.fname.compareTo( o2.fname );
		//String fname,lname,mobile,email,address;
		for(int i=0;i<n;i++){
			Employee e = new Employee();
			System.out.println("Enter the Firstname");
			e.fname = sc.next();
			System.out.println("Enter the Lastname");
			e.lname = sc.next();
			System.out.println("Enter the Mobile");
			e.mobile = sc.next();
			System.out.println("Enter the Email");
			e.email = sc.next();
			System.out.println("Enter the Address");
			e.address = sc.next();
			alist.add(e);
		}	
		alist.sort(compareById);
		//System.out.format("%-15s %-15s %-15s %-30s %-15s\n","Firstname","Lastname","Mobile","Email","Address");
		for (Employee e : alist) {
			System.out.println(e.fname+" "+e.lname+" "+e.mobile+" "+e.email+" "+e.address);
		}
	}
}

