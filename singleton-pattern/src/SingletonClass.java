public class SingletonClass {
    private int value;
    private SingletonClass() {
        value = 25;
    }
    public int getValue() {return value;}
    public void setValue(int value) {this.value = value;}

    //singleton
    private static SingletonClass instance = null;
    public static SingletonClass getInstance() {
        if(instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }
}
