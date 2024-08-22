public class MercedesFactory extends CarFactory{
    @Override
    public Car CreateCar() {
        return new Mercedes();
    }
}
