import java.util.Arrays;
import java.util.Scanner;

public class ReversingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();//1 2 3 4 5//5-0-1=4
        }
        for (int i = 0; i < n/2; i++) {
            int j = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = j;
        }
        System.out.println("Reversed array is : " + Arrays.toString(arr));

    }
}
