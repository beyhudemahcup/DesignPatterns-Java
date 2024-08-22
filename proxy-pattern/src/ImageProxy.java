public class ImageProxy extends Graph {

    private Image img;

    public ImageProxy(String str) {
        filePath = str;
        img = new Image(filePath);
    }

    @Override
    public void Draw() {
        img.Draw();
    }

    @Override
    public void graphInfo() {
        System.out.println("File Name:" + filePath);
    }
}
