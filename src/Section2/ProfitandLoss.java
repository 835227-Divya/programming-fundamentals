package Section2;

import java.util.*;

public class ProfitandLoss {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of toys of dozen purchased");
		int x = sc.nextInt();
		System.out.println("Enter the price per dozen");
		int y = sc.nextInt();
		System.out.println("Enter the selling price of 1 toy");
		int z = sc.nextInt();
		float cp = y / 12f;
		double p = z - cp;
		float pp = (float)(p / cp * 100f);
		System.out.printf("sam's profit percentage is%.2f " , pp );
		System.out.println("percent");


	}

}
