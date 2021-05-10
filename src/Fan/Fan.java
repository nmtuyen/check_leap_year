package Fan;

public class Fan {
    int speed = 1;
    boolean on = false;
    int radius = 5;
    String color = "blue";
    int getSpeed(){
        return this.speed;
    }
    int getRadius(){
        return radius;
    }
    String getColor(){
        return color;
    }
    void setSpeed(int speed){
        this.speed = speed;
    }
    void setRadius(int radius){
        this.radius = radius;
    }
    void setColor(String color){
        this.color = color;
    }
    void setOn(){
        this.on = !this.on;
    }
    public String toString(){
        if (!on){
            return getSpeed()+" " +getColor()+" "+ getRadius()+ " fan is off";
        }else
        return getSpeed()+" " +getColor()+" "+ getRadius()+ " fan is on";
    }

}
class main{
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setOn();
        fan1.setColor("yellow");
        fan1.setSpeed(3);
        fan1.setRadius(10);
        System.out.println(fan1);
        Fan fan2 = new Fan();
        fan2.setOn();
        fan2.setColor("blue");
        fan2.setSpeed(2);
        fan2.setRadius(5);
        System.out.println(fan2);
    }
}
