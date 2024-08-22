public class Main {

    public static void main(String[] args) {

        Part book = new Part("Design Patterns");
        Part part1 = new Part("First Part");
        part1.Add(new TextPart("Iterator pattern"));
        part1.Add(new TextPart("Facade pattern"));

        Part part2 = new Part("Design Patterns Advanced");
        part2.Add(new TextPart("Factory Method pattern"));
        part2.Add(new TextPart("Singleton pattern"));

        Part book2 = new Part("Design Patterns Schema");

        book2.Add(new PicturePart("schema.jpg"));
        book2.Add(new TextPart("check out the picture first and answer questions:"));

        book.Add(part1);
        book.Add(part2);

        showContent(book);
        System.out.println();
        showContent(book2);

    }

    public static void showContent(Content content) {
        content.Operation();
    }
}