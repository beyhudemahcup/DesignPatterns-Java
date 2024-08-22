import java.util.ArrayList;

public class Player {

    private ArrayList<Music> list;
    public Player() {
        list = new ArrayList<Music>();
    }
    public void addMusictoList(Music music) {
        list.add(music);
    }
    public void Play(){
        for(Music music : list){
            music.playMP3();
        }
    }
}
