package Static_Property;

import javax.sound.midi.Track;

public class Car {
    private String name;
    private String engnie;
    public static int numberofcar;
    public Car(String name, String engnie){
        this.name = name;
        this.engnie = engnie;
        numberofcar++;
    }
    public String getName(){
        return name;
    }
    public String getEngnie(){
        return engnie;
    }
}

