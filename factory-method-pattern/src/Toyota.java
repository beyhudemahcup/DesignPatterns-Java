public class Toyota extends Car {

    public Toyota(){
        maxSpeed = 200;
        currentSpeed = 0;
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String brand() {
        return "Toyota";
    }

    @Override
    public void setSpeedLimit(int speed) {
        currentSpeed = speed;
    }
}
