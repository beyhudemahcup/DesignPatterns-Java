import java.util.ArrayList;

public class NormalGame extends AbstractGame{

    ArrayList<AbstractRoom> rooms;

    NormalGame(){
        rooms = new ArrayList<AbstractRoom>();
    }

    @Override
    public void addRoom(AbstractRoom room) {
        rooms.add(room);
    }

    @Override
    public void startGame() {
        System.out.println("Normal game is running...");
        System.out.println("Room number: " + rooms.size());
    }
}
