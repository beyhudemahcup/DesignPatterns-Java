public class MagicalGameFactory extends GameFactory {
    @Override
    public AbstractGame newGame() {
        return new MagicalGame();
    }

    @Override
    public AbstractDoor createDoor() {
        return new MagicalDoor();
    }

    @Override
    public AbstractRoom createRoom() {
        return new MagicalRoom();
    }
}
