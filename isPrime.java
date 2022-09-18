// Prime : If a number divisible by 1 and itself such numbers are called prime numbers
import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if(num % i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.println(num + " is a prime number");
        }
        else{
            System.out.println(num + " is not a prime number");
        }

    }
}
