public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();
        LampOpenClose lampCommand = new LampOpenClose(new Lamp());

        Television tv = new Television();
        PreviousChannel prevCommand = new PreviousChannel(tv);
        NextChannel nextCommand = new NextChannel(tv);

        menu.AddCommand(lampCommand);
        menu.AddCommand(prevCommand);
        menu.AddCommand(nextCommand);

        menu.menu();
    }
}