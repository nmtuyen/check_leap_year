package Shape.MyClass;

public class Shape {
    public String color = "green";
    public boolean filled = true;
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public Shape(){
    }
    private String getColor(){
        return color;
    }
    private void setColor(String color){
        this.color = color;
    }
    private boolean getFilled(){
        return filled;
    }
    private void setFilled(boolean filled){
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}

