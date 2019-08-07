package weekendassignment;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class QuesSeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String id,dob;
		int n=sc.nextInt();
		HashMap<String,String> hmap = new HashMap<>(n);
		ArrayList<String> alist = new ArrayList<String>();
		for(int i=0;i<n;i++){
			id = sc.next();
			dob = sc.next();
			hmap.put(id, dob);
		}
		alist = retirementEmployeeList(hmap);
		for (String string : alist) {
			System.out.println(string);
		}
	}

	static ArrayList<String> retirementEmployeeList(HashMap<String, String> hmap) {
		// TODO Auto-generated method stub
		ArrayList<String> alist = new ArrayList<String>();
		LocalDate curr = LocalDate.of(2014, 01, 01);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		for (Entry<String,String> row : hmap.entrySet()) {
			LocalDate dob = LocalDate.parse(row.getValue(), formatter);
			Period pd = Period.between(dob, curr);
			if(pd.getYears()>=60){
				alist.add(row.getKey());
			}
		}
		Collections.sort(alist);
		return alist;
	}

}
