public class Tree extends Aggregate {

    private int value;
    Tree leftBranch;
    Tree rightBranch;

    public Tree(int value) {
        this.value = value;
        leftBranch = null;
        rightBranch = null;
    }

    public int getValue() { return value; }
    public void addLeftBranch(Tree tree) { leftBranch = tree; }
    public void addRightBranch(Tree tree) { rightBranch = tree; }


    @Override
    public Iterator createIterator() {
        return new TreeIterator(this);
    }
}
