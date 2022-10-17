/*
This class returns :
Day of the week,
Print message to console,
Sum of all even numbers less than 1000,
Sum of even numbers between 12 and 103
*/

public class TryingMethods {
    public static void main(String[] args) {
        System.out.println("Assignment 1");
        daysOfTheWeek(3);
    }

    static void daysOfTheWeek(int day) {
        
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
                
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                break;
        }
    }
    
}