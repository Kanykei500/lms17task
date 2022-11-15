public class Main {
    public static void main(String[] args) {

        Shape sqaure=new Square("квадрат",5);
        System.out.println(sqaure);
        System.out.println(sqaure.getPerimeter());

        Shape parallelogram=new Parallelogram("параллелограм",3,4);
        System.out.println(parallelogram);
        System.out.println(parallelogram.getPerimeter());

        Shape rhombus=new Rhombus("ромб",7);
        System.out.println(rhombus);
        System.out.println(rhombus.getPerimeter());

        Shape trapezium=new Trapezium("trapezium",3,6,4,5);
        System.out.println(trapezium);
        System.out.println(trapezium.getPerimeter());

        Shape triangle=new Triangle("triangle",4,5,6);
        System.out.println(triangle);
        System.out.println(triangle.getPerimeter());
    }
}