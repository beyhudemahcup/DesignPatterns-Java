import java.util.ArrayList;

public class MagicalGame extends AbstractGame{

    ArrayList<AbstractRoom> rooms;

    public MagicalGame() {
        rooms = new ArrayList<AbstractRoom>();
    }

    @Override
    public void addRoom(AbstractRoom room) {
        rooms.add(room);
    }

    @Override
    public void startGame() {
        System.out.println("Magical game started");
        if(rooms.size() > 0){
            if(rooms.get(0).openDoor()){
                System.out.println("The door is opened!");
            }
            else System.out.println("The door is not opened!");
        }
    }
}
