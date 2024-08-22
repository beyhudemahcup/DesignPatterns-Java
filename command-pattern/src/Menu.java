import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private ArrayList<Command> commands;

    public Menu() {
        commands = new ArrayList<Command>();
    }

    public void AddCommand(Command command) {
        commands.add(command);
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        while (num != -1) {
            for (int i = 0; i < commands.size(); i++) {
                System.out.println(i + ":" + commands.get(i).toString());
            }
            System.out.print("-1 for Exit: ");

            try {
                num = scanner.nextInt();
                commands.get(num).Execute();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        System.out.print("You clicked -1, Menu is closing...");
        scanner.close();
    }
}




















