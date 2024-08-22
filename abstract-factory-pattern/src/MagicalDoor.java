import java.util.Scanner;

public class MagicalDoor extends AbstractDoor {

    private String magicalWord;
    private boolean open;

    public MagicalDoor() {
        magicalWord = "Open sesame open";
        open = false;
    }

    @Override
    public boolean openDoor() {
        if (open) {
            return true;
        }
        System.out.println("Enter magical word to open the magical door!");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        scanner.close();

        if (userInput.equalsIgnoreCase(magicalWord)) {
            open = true;
            return open;
        } else return false;
    }

    @Override
    public void closeDoor() {
        open = false;
    }
}
