package Greenatom_Test;

import java.util.Scanner;

public class Greenatom_Test_3_2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		in.close();
		System.out.print(CheckPalindrome(str));
	}
	
	public static boolean CheckPalindrome(String str) {
		String revstr = new StringBuilder(str).reverse().toString();
		return str.equals(revstr);
	}
}