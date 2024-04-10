package  com.jominPractise;
public class MotorBike {
    private int speed;

    MotorBike()
    {
        this(5);
    }

    MotorBike(int speed) //constructor
    {
     this.speed = speed;
    }

    void setSpeed(int speed)
    {
        this.speed = speed;
    }
    int getSpeed()
    {
        return this.speed;
    }
    public void increaseSpeed(int howMuch)
    {
        this.speed+=howMuch;
    }
    void  start()
    {
        System.out.println("BikeStarted");
    }
}
