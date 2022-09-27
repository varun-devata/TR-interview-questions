import java.util.Scanner;

public class HappyNumber {

    static int  isHappy(int n){//49
        int rem = 0,sum = 0;
        while(n > 0) {//49>0,97>0
            rem = n % 10;//9
            sum = sum + (rem*rem);//
            n = n / 10;//
        }
        return sum;//
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int n = num;//49
        int result = num;//49

       while(result != 1 && result != 4){
           result = isHappy(result);
       }

       if(result == 1){
           System.out.println(num + " is a happy number");
       }
       else {
           System.out.println(num + " is not a happy number");
       }
    }
}
