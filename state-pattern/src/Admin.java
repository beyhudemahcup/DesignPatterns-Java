public class Admin implements State{

    private Program program;

    public Admin(Program program) {
        this.program = program;
    }

    @Override
    public void Handle() {
        System.out.println("Admin logged in");
        System.out.println("1-) Add a new user");
        System.out.println("2-) Update a user");
        System.out.println("3-) Delete a user");
        System.out.println("4-) Logout");

        program.Logout();
    }
}
