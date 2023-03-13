package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println(stringReverse(sc.nextLine()));

		sc.close();
	}

	static String stringReverse(String str) {
		String reverseString = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reverseString += str.charAt(i);
		}

		return reverseString;
	}

}
