public class PicturePart implements Content {

    private String picturePath;

    public PicturePart(String picturePath) {
        this.picturePath = picturePath;
    }

    @Override
    public void Operation() {
        System.out.println("<img src='" + picturePath + "'/>");
    }

    @Override
    public void Add(Content content) {
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
