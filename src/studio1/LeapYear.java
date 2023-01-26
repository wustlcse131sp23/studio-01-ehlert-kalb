package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What is the year?");
		int x = in.nextInt();
		boolean LeapYear = ((x%4)== 0) && ((x%100) != 0) || ((x%400)==0);
		System.out.println(LeapYear);
		
		
	}

}
