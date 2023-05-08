package addtwonumbers;

import java.util.Scanner;

public class Add2Num {

	public static void main(String[] args) {
		System.out.println("This program is for addition of 2 numbers");
		
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number :");
		a=sc.nextInt();
		System.out.println("Enter Second number :");
		b=sc.nextInt();
		System.out.println("Addition Of 2 numbers is :");
		c=a+b;
		System.out.println(c);
		
		
	}

}
