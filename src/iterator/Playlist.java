package iterator;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
//    private List<String> songs = new ArrayList<>();
    private String[] songs = new String[10];
    private int count;

    public void add(String song) {
//        songs.add(song);
        songs[count++] = song;
    }

    public Iterator createIterator() {
//        return new ListIterator(this);
        return new ArrayIterator(this);
    }

//    public class ListIterator implements Iterator {
//        private Playlist playlist;
//        private int index;
//
//        public ListIterator(Playlist playlist) {
//            this.playlist = playlist;
//        }
//
//        @Override
//        public boolean hasNext() {
//            return (index < playlist.songs.size());
//        }
//
//        @Override
//        public Object current() {
//            return playlist.songs.get(index);
//        }
//
//        @Override
//        public void next() {
//            index++;
//        }
//    }

    public class ArrayIterator implements Iterator {
        private Playlist playlist;
        private int index;

        public ArrayIterator(Playlist playlist) {
            this.playlist = playlist;
        }

        @Override
        public boolean hasNext() {
            return (index < playlist.count);
        }

        @Override
        public Object current() {
            return playlist.songs[index];
        }

        @Override
        public void next() {
            index++;
        }
    }
}
