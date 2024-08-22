import java.util.ArrayList;

public class Part implements Content{

    private String title;
    private ArrayList<Content> contents;
    public Part(String title) {
        this.title = title;
        contents = new ArrayList<Content>();
    }

    @Override
    public void Operation() {
        System.out.println(title);

        for(Content c : contents) {
            c.Operation();
        }
    }

    @Override
    public void Add(Content content) {
        contents.add(content);
    }

    @Override
    public void Remove(Content content) {
        contents.remove(content);
    }

    @Override
    public Content GetChild(int index) {
        return contents.get(index);
    }
}
