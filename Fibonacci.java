import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = 0,n2 = 1 ;
        int n3;
        System.out.println("Enter the range of fibonacci series : ");
        int range = sc.nextInt();

        System.out.print("Fibonacci series is : " + n1 + " " + n2);
        for (int i = 2; i < range; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;

        }


    }
}
