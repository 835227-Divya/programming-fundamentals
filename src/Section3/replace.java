package Section3;

import java.util.Scanner;

public class replace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the content of the document");
		String str1 = sc.nextLine();
		System.out.println("Enter the old name of the company");
		String str2 = sc.nextLine();
		System.out.println("Enter the new name of the company");
		String str3 = sc.nextLine();
		System.out.println("The content of the modified document is");
		String org = "ITT is a private organisation.ITT is a product based company.DBox is a ITT product";
		System.out.println(org.replace('I', 'T'));
	}
}
