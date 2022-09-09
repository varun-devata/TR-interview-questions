//Sum of first N natural numbers

import java.io.*;
import java.util.Scanner;

public class sumOfNnums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N value:");
		int n =sc.nextInt();
		
		sum = (n*(n+1))/2; //Sum of N terms formula
		
		System.out.println(sum);	
		
	}

}
