public class NextChannel implements Command{

    private Television tv;

    public NextChannel(Television tv) {
        this.tv = tv;
    }

    @Override
    public void Execute() {
        tv.prevChannel();
        System.out.println("Opened channel is: " + tv.validChannel());
    }

    @Override
    public String toString(){
        return "Next Channel";
    }
}
