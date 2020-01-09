package Section3;

import java.util.Scanner;

public class DayWeek {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day number");
		int dayNumber = sc.nextInt();
		String week[] = { "Sun", "Mon", "Tue", "Wed", "Thur", "Fri", "Sat" };
		System.out.println("Day of week is " + week[dayNumber - 1]);
        sc.close();
	}

}
