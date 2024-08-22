public class ListIterator extends Iterator {

    private List list;
    private int index;

    public ListIterator(List list) {
        this.list = list;
        index = 0;
    }

    @Override
    public void First() {
        index = 0;
    }

    @Override
    public void Next() {
        index ++;
    }

    @Override
    public boolean IsDone() {
        return index == list.list.size();
    }

    @Override
    public int CurrentItem() {
        return list.list.get(index);
    }
}
