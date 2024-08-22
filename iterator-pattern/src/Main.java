public class Main {
    public static void main(String[] args) {

        Listing.ShowTheList(new List());

        Tree tree = new Tree(10);

        Tree leftBranch = new Tree(3);
        Tree leftBranch2 = new Tree(4);
        Tree leftBranch3 = new Tree(5);
        Tree leftBranch4 = new Tree(11);

        leftBranch.addLeftBranch(leftBranch2);
        leftBranch2.addLeftBranch(leftBranch3);
        leftBranch3.addLeftBranch(leftBranch4);

        tree.addLeftBranch(leftBranch);

        Tree rightbranch = new Tree(19);
        Tree rightbranch2 = new Tree(13);

        rightbranch.addRightBranch(rightbranch2);
        tree.addRightBranch(rightbranch);

        System.out.println();

        Listing.ShowTheList(tree);
    }
}