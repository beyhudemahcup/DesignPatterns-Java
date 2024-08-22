import java.util.ArrayList;
import java.util.Random;

public class Data implements Subject {
    private ArrayList<Integer> list;
    private ArrayList<ObserverInterface> observers;
    private Random random;

    public Data() {
        random = new Random(System.currentTimeMillis());
        list = new ArrayList<Integer>();
        list.add(random.nextInt(100));
        list.add(random.nextInt(100));
        list.add(random.nextInt(100));
        observers = new ArrayList<ObserverInterface>();
    }

    @Override
    public void Attach(ObserverInterface observerInterface) {
        observers.add(observerInterface);
    }

    @Override
    public void Detach(ObserverInterface observerInterface) {
        observers.remove(observerInterface);
    }

    @Override
    public void Notify() {
        for (ObserverInterface o : observers) {
            o.Update();
        }
    }

    public void newData() {
        list.add(random.nextInt(100));
        Notify();
    }

    public ArrayList<Integer> getData() {
        return list;
    }
}
