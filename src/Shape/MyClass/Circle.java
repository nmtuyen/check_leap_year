package Shape.MyClass;

public class Circle extends Shape {
    private double radius = 1.0;
    private void Circle(){
    }
    private void Circle(double radius){
        this.radius = radius;
    }
    private void Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    private double getRadius(){
        return radius;
    }
    private String getColor(){
        return color;
    }
    private boolean getFilled(){
        return filled;
    }
    private void setRadius(double radius){
        this.radius = radius;
    }
    private void setColor(String color){
        this.color = color;
    }
    private void setFilled(boolean filled){
        this.filled = filled;
    }
    private double getArea(){
        return Math.PI*radius*radius;
    }
    private double getPerimeter(){
        return 2*Math.PI*radius;
    }
    public String toString(){
        return "Hình tròn bán kính "+radius+ " có diện tích là "+ getArea()+ ", chu vi là "+ getPerimeter();
    }

}
