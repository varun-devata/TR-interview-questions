import java.util.Scanner;
import java.util.StringTokenizer;

public class String_Tokenizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str," ");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }

    }
}
