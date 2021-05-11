package Static_Property;

public class Run {
    public static void main(String[] args) {
        Car car1 = new Car("Honda", "V8");
        System.out.println(car1.getName());
        System.out.println(Car.numberofcar);
        Car car2 = new Car("Exciter", "Chương");
        System.out.println(Car.numberofcar);
    }
}
