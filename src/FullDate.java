import java.util.Scanner;

public class FullDate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String monthString;

        System.out.println("Enter month (mm): ");
        int month = input.nextInt();

        System.out.println("Enter day (dd): ");
        int day = input.nextInt();

        System.out.println("Enter year (yy): ");
        int year = input.nextInt();

        switch (month) {
            case 1:  monthString = "January";
                break;
            case 2:  monthString = "February";
                break;
            case 3:  monthString = "March";
                break;
            case 4:  monthString = "April";
                break;
            case 5:  monthString = "May";
                break;
            case 6:  monthString = "June";
                break;
            case 7:  monthString = "July";
                break;
            case 8:  monthString = "August";
                break;
            case 9:  monthString = "September";
                break;
            case 10: monthString = "October";
                break;
            case 11: monthString = "November";
                break;
            case 12: monthString = "December";
                break;
            default: monthString = "Invalid Month";
                break;
        }

        if (monthString == "Invalid Month") {
            System.out.println("For month, please enter a number from 1 - 12");
        } else if (day > 31) {
            System.out.println("For day, please enter a number between 1 - 31");
        } else {
            System.out.println("It is " + monthString + " " + day + ", " + "20" + year + ".");
        }
    }
}
