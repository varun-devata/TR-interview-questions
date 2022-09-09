//check for a number is even or odd
import java.io.*;
import java.util.Scanner;

public class evenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numer: ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println(num + " is even");
		}
		else {
			System.out.println(num + " is odd");
		}

	}

}
