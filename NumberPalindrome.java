import java.util.Scanner;

//Number Palindrome : If the reverse of a number is same as the actual number such numbers are called palindromes
//Ex : 121 its reverse is 121 or 1221 etc...
public class NumberPalindrome {
    public static void main(String[] args) {
        int rev = 0;
        int rem;
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter no of digits in a number : ");
//        int digit = sc.nextInt();
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int n = num;

        while(n != 0){
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }

        if(num == rev){
            System.out.println(num + " is palindrome");
        }
        else{
            System.out.println(num + " is not a palindrome");
        }


    }
}
