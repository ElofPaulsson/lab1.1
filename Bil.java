import java.awt.*;

public class Bil implements Movable {
    public static void main(String[] args){

    }

    public int Dir = 90;
    public double Xpos = 0;
    public double Ypos = 0;

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
        int value = (Dir % 360);
        value = value / 90;
        switch (value){
            case 0:
                Xpos += getCurrentSpeed();
                break;
            case 1:
                Ypos += getCurrentSpeed();
                break;
            case 2:
                Xpos -= getCurrentSpeed();
                break;
            case 3:
                Ypos -= getCurrentSpeed();
                break;
        }

    }

    @Override
    public void turnLeft() {
        Dir += 90;

    }

    @Override
    public void turnRight() {
        Dir += 90;

    }
}
