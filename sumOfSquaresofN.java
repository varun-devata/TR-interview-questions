//Sum of squares of first N natural numbers

import java.io.*;
import java.util.*;

public class sumOfSquaresofN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N value: ");
		int n = sc.nextInt();
		
		for(int i = 1;i <= n; i++) {
			sum = sum + i*i;
		}
		
		System.out.println(sum);
		

	}

}
