
public interface Subject {
    void Attach(ObserverInterface observer);
    void Detach(ObserverInterface observer);
    void Notify();
}
