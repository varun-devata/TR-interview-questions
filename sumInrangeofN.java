//sum of number in range of N

import java.io.*;
import java.util.Scanner;

public class sumInrangeofN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first,last,sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		first = sc.nextInt();
		System.out.println("Enter last number:");
		last = sc.nextInt();
		
		for(int i = first; i <= last; i++) {
			sum += i;
		}
		
		System.out.println("Sum is : " + sum);

	}

}
