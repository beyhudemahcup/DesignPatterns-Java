public class Image extends Graph {

    private byte data[];

    public Image(String str) {
        filePath = str;
        data = null;
    }

    @Override
    public void Draw() {
        if (data == null) {
            System.out.println("File is loading: " + filePath);
            data = new byte[1000000];
            System.out.println("File is drawing: " + filePath);
        } else {
            System.out.println("File is loading: " + filePath);
        }
    }

    @Override
    public void graphInfo() {

    }
}
