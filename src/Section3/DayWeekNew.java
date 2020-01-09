package Section3;

import java.util.Scanner;

public class DayWeekNew {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day number");
        int dayNumber = sc.nextInt();
        String week[] = new String[7];
        week[0] = "Sun";
        week[1] = "Mon";
        week[2] = "Tue";
        week[3] = "Wed";
        week[4] = "Thur";
        week[5] = "Fri";
        week[6] = "Sat";
        System.out.println("Day of week is " + week[dayNumber - 1]);
        sc.close();

    }

}
