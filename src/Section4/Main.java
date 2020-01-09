package Section4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of GencS");
        int n = sc.nextInt();
        Trainee t[] = new Trainee[n];
        for (int i = 0; i < n; i++) {
            t[i] = new Trainee();
            System.out.println("Enter the Employee Id");
            int employeeId = sc.nextInt();
            sc.nextLine();
            t[i].setEmployeeId(employeeId);
            System.out.println("Enter Name");
            String name = sc.nextLine();
            t[i].setName(name);
        }
        Trainee tr = new Trainee();
        tr.display(t);
        sc.close();
    }
}
