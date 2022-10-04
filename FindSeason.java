//This program is to find the season of the months
//It takes month number as an input and returns the season of that month

import java.util.Scanner;
public class FindSeason {
        public static String solve(int A) {
            String season ;
            if(A == 3 || A == 4 || A == 5){
                season = "Spring";
            }
            else if(A == 6 || A == 7 || A == 8) {
                season = "Summer";
            }
            else if(A == 9 || A == 10 || A == 11) {
                season = "Autumn";
            }
            else {
                season = " Winter";
            }
            return season;

        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1.January\n2.February\n3.March\n4.April\n5.May\n6.June");
            System.out.println("7.July\n8.August\n9.September\n10.October\n11.November\n12.December");
            System.out.println("Enter a month number : ");
            int month = sc.nextInt();
            solve(month);
            System.out.println("Season of month " + month + " is : "+ solve(month));
        }


}
