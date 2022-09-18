/*Amstrong Number : If the sum of powers of each digit of a number is equal to the same number then such numbers are called amstrong numbers
  Example : 153 = 1**3 + 5**3 + 3**3 = 153
            1634 = 1**4 + 6**4 + 3**4 + 4**4 = 1634
 */

import java.util.Scanner;
import java.math.*;
public class AmstrongNumber {
    public static void main(String[] args) {
        int n;
        double sum=0,rem=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ente no of digits in the number : ");
        int digit = sc.nextInt();
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        n = num;
        while(n != 0){
            rem = n % 10;
            sum = sum + Math.pow(rem,digit);
            n = n /10;
        }
        if( num == sum){
            System.out.println(num + " is an amstrong number");
        }
        else {
            System.out.println(num + " is not an amstrong number");
        }


    }

}

