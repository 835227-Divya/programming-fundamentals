package Section4;

import java.util.Scanner;

public class ProductDetailsUsingConstructor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Product1 p=new Product1();
		System.out.println("Enter the product ID");
		Long id=sc.nextLong();
		p.setId(id);
		sc.nextLine();
		System.out.println("Enter the Product name");
		String productName=sc.nextLine();
		p.setProductName(productName);
		System.out.println("Enter the Suppliers name");
		String supplierName=sc.nextLine();
		p.getSupplierName(supplierName);
		Product1 ps=new Product1(id,productName,supplierName);
		ps.display();
		sc.close();
	}

}
