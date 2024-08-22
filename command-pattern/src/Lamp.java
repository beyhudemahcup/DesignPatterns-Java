public class Lamp {

    private int lamp;
    public Lamp() {
        lamp = 0;
    }

    public void OpenLamp(){
        System.out.println("Lamp is open");
        lamp = 1;
    }
    public void CloseLamp(){
        System.out.println("Lamp is closed");
        lamp = 0;
    }
    public int LampValue(){
        return lamp;
    }


}
