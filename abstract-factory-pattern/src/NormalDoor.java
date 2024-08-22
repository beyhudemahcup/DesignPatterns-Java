public class NormalDoor extends AbstractDoor {

    private boolean open = false;

    @Override
    public boolean openDoor() {
        open = true;
        return true;
    }

    @Override
    public void closeDoor() {
        open = false;
    }
}
