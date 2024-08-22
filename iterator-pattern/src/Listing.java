public class Listing {
    public static void ShowTheList(Aggregate aggregate){

        Iterator i = aggregate.createIterator();

        for (i.First(); !i.IsDone(); i.Next()) {
            System.out.print(i.CurrentItem() + " ");
        }
    }
}
