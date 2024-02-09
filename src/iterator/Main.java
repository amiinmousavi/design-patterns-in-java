package iterator;

public class Main {
    public static void main(String[] args) {
        var playlist = new Playlist();

        playlist.add("Stardust Serenade");
        playlist.add("Moonlit Whispers");
        playlist.add("Echoes of Eternity");

        Iterator iterator = playlist.createIterator();

        while(iterator.hasNext()) {
            var song = iterator.current();
            System.out.println(song);
            iterator.next();
        }
    }
}
