import java.util.Scanner;
public class FactorialRecursion {
    public int Factorial(int n){
        if(n == 0 || n == 1)
            return 1;
        else {
            return n * Factorial(n - 1);//5*4*3*2*1
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        FactorialRecursion obj = new FactorialRecursion();

        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int fact = obj.Factorial(num);
        System.out.println("Factorial of " + num + " is : " + fact);
    }
}
