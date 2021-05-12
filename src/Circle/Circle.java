package Circle;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle() {
    }

    private double getRadius() {
        return radius;
    }

    private void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return 3.14*radius*radius;
    }

    @Override
    public String toString() {
        return "Hình tròn này có bán kính là: "+ getRadius()+ " màu là: "+ getColor();
    }
}
