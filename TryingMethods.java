import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

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
    }
    
    public static void sumOfEvenNumber() {
        int sum = 0;
        for(int i = 12; i <= 103; i++) {
            if(i % 2 == 0) {
                sum += i;          
            }
            
        }
        System.out.println(sum);
    }
}