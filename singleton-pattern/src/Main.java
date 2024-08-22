public class Main {
    public static void main(String[] args) {

        //get singletonClass instance with getInstance method
        SingletonClass instance = SingletonClass.getInstance();

        System.out.println(instance.getValue());
        instance.setValue(33);
        SingletonClass secondInstance = SingletonClass.getInstance();
        //we expect to see 33 as a value.
        System.out.println(secondInstance.getValue());

    }
}