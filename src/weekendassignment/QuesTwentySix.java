package weekendassignment;

import java.util.Scanner;

class Product{
	private long id;
	private String productName;
	private String supplierName;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	// 3 Argument Constructor
	public Product(long id, String productName, String supplierName) {
		this.id = id;
		this.productName = productName;
		this.supplierName = supplierName;
	}
	//2 Argument Constructor
	public Product(long id, String productName) {
		super();
		this.id = id;
		this.productName = productName;
		this.supplierName = "Nivas";
	}
	//default Constructor
	public Product() {
		
	}
	
	void display(){
		System.out.println("Product Id:"+this.id);
		System.out.println("Product Name:"+this.productName);
		System.out.println("Supplier Name:"+this.supplierName);
	}
}

public class QuesTwentySix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Product pd;
		long pid;
		String pname,sname,choice;
		System.out.println("Enter the product id");
		pid= sc.nextLong();
		System.out.println("Enter the product name");
		pname = sc.next();
		System.out.println("Is the product supplied by Nivas Suppliers? Type yes or no(not case sensitive)");
		choice = sc.next();
		if(choice.equalsIgnoreCase("yes")){
			pd = new Product(pid,pname);
			pd.display();
		}
		else {
			System.out.println("Enter the supplier name:");
			sname =sc.next();
			pd=new Product(pid,pname,sname);
			pd.display();
		}
		
	}

}
