package Section2;

import java.util.Scanner;

public class LabAllocation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		int z;
		System.out.println("Enter x");
		x = sc.nextInt();
		System.out.println("Enter y");
		y = sc.nextInt();
		System.out.println("Enter z");
		z = sc.nextInt();
		if (x < y && x < z) {
			System.out.println("L1 has minimal seating capacity");
		} else if (x > y && x > z) {
			System.out.println("L2 has minimal seating capacity");
		} else {
			System.out.println("L3 has minimal seating capacity");
		}
		sc.close();
	}
}
