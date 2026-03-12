package PostConstructorPreDestroyer;

public class Vehicle {
    public Vehicle(){
        System.out.println("Vehicle constructor");
    }
    public void moving(){
        System.out.println("vehicle is moving");
    }
    public void accident(){
        System.out.println("Thank god, no one left");
    }
}
