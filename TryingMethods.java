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
        sumOfEvenNumber();
        TryingMethods weekly = new TryingMethods();
        weekly.daysOfTheWeek(4);
    }
    
    public static void sumOfEvenNumber() {
        int sum = 0;
        for(int i = 12; i <= 103; i++) {
            if(i % 2 == 0) {
                sum += i;          
            }   
        }
        System.out.println("Sum of even numbers between 12 and 103: " + sum);
    }

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