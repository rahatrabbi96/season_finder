import java.util.Scanner;

public class season_finder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // variable
        int month = 0;
        int day = 0;
        String season = " ";

        // Scanner
        System.out.println("type the month (MM) : ");
        month = scan.nextInt();
        System.out.println("type the day (DD) : ");
        day = scan.nextInt();

        // Conditional Statements
        if (month == 1 || month == 2 || month == 3 ) {
            season = "Winter";
        } else if (month == 4 || month == 5 || month == 6 ) {
            season = "Spring";
        } else if (month == 7 || month == 8 || month == 9 ) {
            season = "Summer";
        } else if (month == 10 || month == 11 || month == 12 ) {
            season = "Fall";
        }
        

        if ( month % 3 == 0 && day >= 21){
            if (season == "Winter") {
                season = "Spring";
            } else if (season == "Spring") {
                season = "Summer";
            }else if (season == "Summer") {
                season = "Fall";
            }
        }
        // Output
        System.out.println("The season is  " + season);
    }

}