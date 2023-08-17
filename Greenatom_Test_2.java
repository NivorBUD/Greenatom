package Greenatom_Test;
import java.util.Scanner;

public class Greenatom_Test_2 {
	static int num1 = 0;
	static int num2 = 0;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		num1 = in.nextInt();
		num2 = in.nextInt();
		Change();
		System.out.println(num1);
		System.out.println(num2);
		in.close();
	}
	
	public static void Change() {
		num1 ^= num2;
		num2 ^= num1;
		num1 ^= num2;
	}
}