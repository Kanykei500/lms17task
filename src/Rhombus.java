public class Rhombus extends Shape{
    private double length;




    public Rhombus(String name, double length) {
        super(name);
        this.length=length;

    }

    @Override
    public double getPerimeter() {
        return 4*length;
    }

    public double getLength() {

        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rhombus{" +
                "length=" + length +
                '}';
    }
}
