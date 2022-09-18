import java.util.Scanner;
public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char c[] = str.toCharArray();
        String rev = "";
        for(int i = c.length-1; i >= 0; i--){
            rev = rev + c[i];

        }
        System.out.println(rev);        
    }
    
}
