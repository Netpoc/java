/*
First JAVA Assignment
 */
import java.util.Scanner; // import the scanner class


public class TryingMethods {
    public static void main(String[] args) {    
        System.out.println("Assignment 1");

        //Request Input from User
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter day Number:");

        //Capture User Input
        int dayNumber = scanner.nextInt();

        // Creating and Insance of dayOfTheWeek()
        TryingMethods weekly = new TryingMethods();
        String day = weekly.daysOfTheWeek(dayNumber);

        //Output for dayOfTheWeek
        System.out.println("The Day is: "+ day);
    }
    

    /*
    This class returns day of the week,
    */
    public String daysOfTheWeek(int a) {
        String day = "";
        switch (a) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;

            default:
                break;
        }
        return day;
    }

        
}

