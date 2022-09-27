import java.util.Scanner;

public class FibonacciRecursion {
    static int n1 = 0,n2 = 1;
    static int n3 = 0;
    public void Fibonacci(int range) {
        if(range > 0) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
            Fibonacci(range-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FibonacciRecursion obj = new FibonacciRecursion();
        System.out.println("Enter range of the fibonacci series : ");
        int range = sc.nextInt();
        System.out.print("Fibonacci series is : " + n1 + " " + n2);
        obj.Fibonacci(range-2);
    }

}
