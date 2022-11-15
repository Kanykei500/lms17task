public class Parallelogram extends Shape{
    private int a;
    private int b;
    public Parallelogram(String name) {
        super(name);
    }

    public Parallelogram(String name, int a,int b) {
        super(name);
        this.a = a;
        this.b=b;
    }


    @Override
    public double getPerimeter() {
        return a+b+a+b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Parallelogram{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
