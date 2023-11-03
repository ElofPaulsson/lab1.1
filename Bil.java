import java.awt.*;

public class Bil {
    public static void main(String[] args){

    }

    public int nrDoors; // Number of doors on the car
    public double enginePower; // Engine power of the car
    public double currentSpeed; // The current speed of the car
    public Color color; // Color of the car
    public String modelName; // The car model name


    public Color getColor(){
        return color;
    }

    public void setColor(Color clr){
        color = clr;
    }

    public int getNrDoors(){
        return nrDoors;
    }
    public double getEnginePower(){
        return enginePower;
    }

    public void startEngine(){
        currentSpeed = 0.1;
    }

    public void stopEngine(){
        currentSpeed = 0;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }


}
