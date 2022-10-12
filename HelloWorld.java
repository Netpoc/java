public class HelloWorld {
    public static void main(String[] args) {

    System.out.println("Hello World!");
    testVariables();    
    }

    public static void testVariables() {
        int sampleInt = 39;
        double sampleDouble = 0.58;
        float sampleFloat = 56f;
        String name = "Peter Ayenoto";

        //Casting in Java
        double doubleCasted = sampleInt;
        int intCasted = (int) sampleDouble;
        System.out.println(intCasted);

    }
}