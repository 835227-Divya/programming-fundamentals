package Section3;

import java.util.Scanner;

public class url {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String url = sc.nextLine();
		System.out.println("Enter the start string");
		String s = sc.nextLine();
		if (url.startsWith(s)) {
			System.out.println("\"" + url + "\" starts with \"" + s + "\"");

		} else {
			System.out.println("\"" + url + "\" does not start with \"" + s + "\"");
		}
		sc.close();
	}

}
