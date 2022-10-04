import java.util.Scanner;

public class StrLen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        int len = str.length();
        System.out.println("Length of the string is : " + len);
    }
}
