public class UnregisteredUser implements State {

    private Program program;

    public UnregisteredUser(Program program) {
        this.program = program;
    }

    @Override
    public void Handle() {
        System.out.println("You are already unregistered.");
        System.out.println("1-) Register");
        System.out.println("2-) User login");
        System.out.println("3- Admin login");

        program.Login();
    }
}
