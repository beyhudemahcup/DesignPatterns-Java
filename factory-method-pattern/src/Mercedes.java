public class Mercedes extends Car{

    public Mercedes(){
        maxSpeed = 240;
        currentSpeed = 0;
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String brand() {
        return "Mercedes";
    }

    @Override
    public void setSpeedLimit(int speed) {
        currentSpeed = speed;
    }
}
