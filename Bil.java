import java.awt.*;

public class Bil implements Movable {
    public static void main(String[] args){

    }

    public int nrDoors; // Number of doors on the car
    public double enginePower; // Engine power of the car
    public double currentSpeed; // The current speed of the car
    public Color color; // Color of the car
    public String modelName; // The car model name


    private Color getColor(){return color;}

    private void setColor(Color clr){
        color = clr;
    }

    private int getNrDoors(){
        return nrDoors;
    }
    private double getEnginePower(){
        return enginePower;
    }

    private void startEngine(){
        currentSpeed = 0.1;
    }

    public void stopEngine(){
        currentSpeed = 0;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }


    @Override
    public void move() {

    }

    @Override
    public void turnLeft() {
        System.out.println("Hej");

    }

    @Override
    public void turnRight() {

    }
}
