public class Main {

    public static void main(String[] args) {
        ImageProxy imageProxy = new ImageProxy("image.jpg");
        infos(imageProxy);
        drawOnScreen(imageProxy);

        ImageProxy imageProxy2 = new ImageProxy("image2.jpg");
        infos(imageProxy2);
        drawOnScreen(imageProxy2);
        drawOnScreen(imageProxy);
    }

    public static void infos(Graph graph){
        graph.graphInfo();
    }
    public static void drawOnScreen(Graph graph){
        graph.Draw();
    }
}