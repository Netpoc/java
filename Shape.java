abstract public class Shape {

    private double startPosition;

    public Shape(double startPosition) {

    }
    abstract double calculateVolume();
    abstract double findArea();

    void move(double nextLocation) {
        System.out.println("Moved from " + startPosition + " to" + nextLocation);
    }
}