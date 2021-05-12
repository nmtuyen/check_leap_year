package Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(2.5, "orange");
        System.out.println(circle1.getColor());
        System.out.println(circle1.toString());
        System.out.println(circle1.getArea());
    }
}
