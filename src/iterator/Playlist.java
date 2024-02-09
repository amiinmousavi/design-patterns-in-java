package iterator;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
//    private List<String> songs = new ArrayList<>();
    private String[] songs = new String[10];
    private int count;

    public void add(String song) {
        songs[count++] = song;
    }

//    public List<String> getSongs() {
//        return songs;
//    }

    public String[] getSongs() {
        return songs;
    }
}
