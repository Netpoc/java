public class Main {
    public static void main(String[] args){
        sum(2, 2);
        Test.Testings();

        //Data Types
        int examScore = 89;
        double dexamScore = examScore;
        float floatNumber = 12.7f;
        boolean hasPass = true;

        System.out.println("Hello World! " + dexamScore);
    }

    public static void sum(int a, int b){
        System.out.println(a+b);
    }
}