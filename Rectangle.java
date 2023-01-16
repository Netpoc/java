/**
 * Rectangle
 */
public class Rectangle extends Shape{
    private double length;
    private double breath;
    Rectangle(double startPosition, double length, double breath) {
        super(startPosition);
        this.length = length;
        this.breath = breath;
    }

    @Override
    double calculateVolume() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    double findArea() {
        // TODO Auto-generated method stub
        return this.breath * this.length;
    }

    public static void main(String[] args) {
    Shape rec = new Rectangle(80, 10, 30);
    rec.findArea();
}
    
}