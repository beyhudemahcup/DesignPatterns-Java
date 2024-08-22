public class Program {

    private State state;

    public Program() {
        state = new UnregisteredUser(this);
    }

    public void Run() {
        state.Handle();
    }

    public void Login() {
        state = new User(this);
        Run();
    }

    public void Admin() {
        state = new Admin(this);
    }

    public void Logout() {
        state = new UnregisteredUser(this);
    }
}
