package com.gainjava.knowledge;

import java.util.Scanner;

public class userinput {
	public static void main(String[] args)
	{
      int num;
      System.out.println("Enter the integer: ");
      @SuppressWarnings("resource")
	Scanner s = new Scanner(System.in);
      num = s.nextInt();

		System.out.println("Entered integer is: "
						+ num);
	}
}
