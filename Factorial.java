import java.util.Scanner;

public class Factorial {//5 = 5 * 4 * 3 * 2 * 1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  number : ");
        int num = sc.nextInt();
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact *= i;

        }

        System.out.println("Factorial of " + num + " is : " + fact);


    }
}
