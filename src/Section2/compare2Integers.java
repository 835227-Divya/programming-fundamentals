package Section2;

import java.util.Scanner;

public class compare2Integers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int x = sc.nextInt();
        System.out.println("Enter the second number");
        int y = sc.nextInt();
        sc.close();
        int Result = Integer.compare(x, y);
        if (Result > 0) {
            System.out.println(x + " is greater than " + y);
        } else if (Result < 0) {
            System.out.println(x + " is less than " + y);
        } else {
            System.out.println(x + " is equal to " + y);

        }
    }
}
