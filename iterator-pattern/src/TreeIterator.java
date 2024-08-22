import java.util.Stack;

public class TreeIterator extends Iterator{

    Tree start;
    Tree updated;
    Stack<Tree> stack;

    public TreeIterator(Tree tree) {
        start = tree;
        stack = new Stack<>();
    }

    @Override
    public void First() {
        updated = start;
        stack = new Stack<>();
        stack.push(updated);
    }

    @Override
    public void Next() {
        if(updated.rightBranch != null) stack.push(updated.rightBranch);
        if(updated.leftBranch != null) stack.push(updated.leftBranch);
    }

    @Override
    public boolean IsDone() {
        return stack.isEmpty();
    }

    @Override
    public int CurrentItem() {
        updated = stack.pop();
        return updated.getValue();
    }
}
