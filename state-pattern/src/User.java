public class User implements State {

    private Program program;

    public User(Program program) {
        this.program = program;
    }

    @Override
    public void Handle() {
        System.out.println("You are now logged in");
        System.out.println("1-) User settings");
        System.out.println("2-) Service 1");
        System.out.println("3-) Service 2");
        System.out.println("4-) Logout");

        program.Logout();
    }
}
