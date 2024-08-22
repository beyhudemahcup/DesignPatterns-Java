public class Main {

    public static void main(String[] args) {

        Player player = new Player();
        //songs are added with mp3 format
        player.addMusictoList(new Music("Cem Karaca - Bir of ceksem"));
        player.addMusictoList(new Music("King Crimpson - Epitaph"));

        //songs are added with ogg format
        player.addMusictoList(new OGGAdapter("Camel - Lady Fantasy"));
        player.addMusictoList(new OGGAdapter("Khruangbin - Texas Sun"));

        //songs are playing now
        player.Play();

    }
}