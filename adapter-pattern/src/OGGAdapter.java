public class OGGAdapter extends Music{
    private OGG ogg;

    public OGGAdapter(String musicName) {
        super(musicName);
        ogg = new OGG(musicName);
    }
    @Override
    public void playMP3() {
        //play a song in ogg with x1 speed
        ogg.playOGG(1);
    }
}
