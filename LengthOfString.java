//Finding the length of a string without using strlen() function.

import java.util.Scanner;

public class LengthOfString {
    public static void main(String[] args) {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        char ch[] = str.toCharArray();
        for (char c : ch) {
            i++;
        }
        System.out.println("Length of String given string is : " + i);
    }
}
