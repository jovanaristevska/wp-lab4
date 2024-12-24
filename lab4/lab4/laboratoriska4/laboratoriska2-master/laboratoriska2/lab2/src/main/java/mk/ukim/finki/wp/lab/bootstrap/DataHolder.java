package mk.ukim.finki.wp.lab.bootstrap;

import jakarta.annotation.PostConstruct;
import mk.ukim.finki.wp.lab.model.Album;
import mk.ukim.finki.wp.lab.model.Artist;
import mk.ukim.finki.wp.lab.model.Song;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {

    public static List<Artist> artists = null;
    public static List<Song> songs = null;

    public static List<Album> albums = null;

//    @PostConstruct
//    public void init(){
//        artists = new ArrayList<>();
//        artists.add(new Artist(1l, "Glenn ", "Danzig", "Artist1Bio"));
//        artists.add(new Artist(2l, "Burna ", "Boy", "Artist2Bio"));
//        artists.add(new Artist(3l, "Paul", "Westerberg", "Artist3Bio"));
//        artists.add(new Artist(4l, "Poly ", "Styrene", "Artist4Bio"));
//        artists.add(new Artist(5l, "Kelly ", "Clarkson", "Artist5Bio"));
//
//        albums = new ArrayList<>();
//        albums.add(new Album("Album1 ", "pop", "2000"));
//        albums.add(new Album("Album2 ", "rock", "2001"));
//        albums.add(new Album("Album3", "pop", "2002"));
//        albums.add(new Album("Album4 ", "classic", "2003"));
//        albums.add(new Album("Album5 ", "pop", "2004"));
//
//
//        songs = new ArrayList<>();
//        songs.add(new Song("I Wish", "Pop", 2010, albums.get(0)));
//        songs.add(new Song( "Too many reasons", "Hip hop", 2011, albums.get(3)));
//        songs.add(new Song("Sip", "Rock", 2012, albums.get(2)));
//        songs.add(new Song("Back Outside", "Classic rock", 2013, albums.get(4)));
//        songs.add(new Song("Eyes Don't Lie", "Electronic", 2014, albums.get(1)));
//    }
}
