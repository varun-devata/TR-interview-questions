//Reversing a string using StringBuffer class
import java.util.Scanner;
public class StringRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a atring : ");
        String str = sc.nextLine();
        StringBuffer sb = new StringBuffer(str);
        StringBuffer s = sb.reverse();
        System.out.println(s);
    }
}
