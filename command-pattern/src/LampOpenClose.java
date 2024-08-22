public class LampOpenClose implements Command{

    Lamp lamp;

    public LampOpenClose(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void Execute() {
        if(lamp.LampValue() == 1) lamp.CloseLamp();
        else lamp.OpenLamp();
    }

    @Override
    public String toString(){
        if(lamp.LampValue() == 1) return "Close Lamp";
        else return "Open Lamp";
    }
}
