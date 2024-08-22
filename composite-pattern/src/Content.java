public interface Content {
    void Operation();
    void Add(Content content);
    void Remove(Content content);
    Content GetChild(int index);
}
