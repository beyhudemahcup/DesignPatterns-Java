public class Main {
    public static void main(String[] args) {
        //car method expects a CarFactory object
        car(new MercedesFactory());
        car(new ToyotaFactory());

    }
    public static void car(CarFactory cf){
        Car car = cf.CreateCar();
        System.out.println( car.brand() + "-branded car is created" );
    }
}