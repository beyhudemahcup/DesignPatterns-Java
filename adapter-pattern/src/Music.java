public class Music {

    private String musicName;
    public Music(String musicName) {
        this.musicName = musicName;
    }
    public void playMP3() {
        System.out.println("Playing MP3 file: " + musicName);
    }
}
