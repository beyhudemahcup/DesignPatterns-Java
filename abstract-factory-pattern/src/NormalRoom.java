public class NormalRoom extends AbstractRoom {

    AbstractDoor door;

    @Override
    public void createDoor(AbstractDoor door) {
        this.door = door;
    }

    @Override
    public boolean openDoor() {
        return door.openDoor();
    }
}
