package Apr04;

public interface Car {
    int numOfWheels=4; // this variable is by defualt final
    public void accelerate();
    public void media();
    static void run(){
        System.out.println("This is a static method defined in 'Car' Interface");
    }
}
