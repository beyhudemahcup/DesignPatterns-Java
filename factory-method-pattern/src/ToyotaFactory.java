public class ToyotaFactory extends CarFactory {
    @Override
    public Car CreateCar() {
        return new Toyota();
    }
}
