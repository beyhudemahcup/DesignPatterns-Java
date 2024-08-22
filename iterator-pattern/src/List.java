import java.util.ArrayList;

public class List extends Aggregate {
    public ArrayList<Integer> list;

    public List(){
        list = new ArrayList<>();
        for(int i = 5; i > 0; i--){
            list.add(i);
        }
    }

    @Override
    public Iterator createIterator() {
        return new ListIterator(this);
    }
}
