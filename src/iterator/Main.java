package iterator;

public class Main {
    public static void main(String[] args) {
        var playlist = new Playlist();

        playlist.add("Stardust Serenade");
        playlist.add("Moonlit Whispers");
        playlist.add("Echoes of Eternity");

        for (var i = 0; i < playlist.getSongs().size(); i++) {
            System.out.println(playlist.getSongs().get(i));
        }
    }
}
