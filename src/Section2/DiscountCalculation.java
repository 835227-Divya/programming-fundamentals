package Section2;

import java.util.Scanner;

public class DiscountCalculation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Price of item 1");
		double x = sc.nextDouble();
		System.out.println("Price of item 2");
		double y = sc.nextDouble();
		System.out.println("Discount in percentage");
		int z = sc.nextInt();
		double total = x + y;
		System.out.printf("Total amount: $%.2f \n", total);
		double saved = (total / 2);
		double disamt = total - saved;
		System.out.printf("Discounted amount: $%.2f \n", disamt);
		System.out.printf("Saved amount: $%.2f \n", saved);

		// TODO Auto-generated method stub

	}

}
