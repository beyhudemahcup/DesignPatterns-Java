public class NormalGameFactory extends GameFactory {
    @Override
    public AbstractGame newGame() {
        return new NormalGame();
    }

    @Override
    public AbstractDoor createDoor() {
        return new NormalDoor();
    }

    @Override
    public AbstractRoom createRoom() {
        return new NormalRoom();
    }
}
