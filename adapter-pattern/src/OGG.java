public class OGG {

    private String musicName;
    public OGG(String musicName) {
        this.musicName = musicName;
    }
    public void playOGG(int speed) {
        System.out.println("Playing OGG file: " + musicName +  " with "+ speed + " speed");
    }
}
