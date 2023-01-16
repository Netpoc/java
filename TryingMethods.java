/*
First JAVA Assignment
 */
import java.text.SimpleDateFormat;
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
        int sum = weekly.sumOfEvenNumbers();

        //Output for dayOfTheWeek
        System.out.println("The Day is: "+ day);

        //Output for Sum of Even Number
        System.out.println("Sum of even number between 12 and 103: "+ sum);

        //Output Sum of Numbers less than 1000
        sumNumber();
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
    
    //This method returns sum of even number between 12 and 103

    int sumOfEvenNumbers(){
        int sum = 0;
        for(int i = 12; i <= 103; i += 2) {
            sum += i;
        }
        return sum;
    }

    static void sumNumber() {
        int i = 0;
        int sum = 0;
        while (i <= 1000) {
            //Iterating through i
            i++;
            //Calculating Sum
            sum += i;
        }
        System.out.println("Sum of Numbers Less than 1000: " + sum);
    }

        
}

