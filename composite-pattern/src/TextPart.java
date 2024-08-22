public class TextPart implements Content{

    private String content;
    public TextPart(String content) {
        this.content = content;
    }

    @Override
    public void Operation() {
        System.out.println(content);
    }

    @Override
    public void Add(Content content) {
        //empty methods for TextPart class
        return;
    }

    @Override
    public void Remove(Content content) {
        return;
    }

    @Override
    public Content GetChild(int index) {
        return null;
    }
}
