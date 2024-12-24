package mk.ukim.finki.wp.lab.config;

import jakarta.annotation.PostConstruct;
import mk.ukim.finki.wp.lab.model.Album;
import mk.ukim.finki.wp.lab.model.Song;
import mk.ukim.finki.wp.lab.repository.jpa.AlbumRepository;
import mk.ukim.finki.wp.lab.repository.jpa.ArtistRepository;
import mk.ukim.finki.wp.lab.repository.jpa.SongRepository;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {

    private final SongRepository songRepository;
    private final AlbumRepository albumRepository;
    private final ArtistRepository artistRepository;

    public DataInitializer(SongRepository songRepository,
                           AlbumRepository albumRepository,
                           ArtistRepository artistRepository) {
        this.songRepository = songRepository;
        this.albumRepository = albumRepository;
        this.artistRepository = artistRepository;
    }

    @PostConstruct
    public void initData() {
        Album album1 = new Album("Album1", "pop", "2000");
        Album album2 = new Album("Album2", "rock", "2001");
        Album album3 = new Album("Album3", "pop", "2002");
        Album album4 = new Album("Album4", "classic", "2003");
        Album album5 = new Album("Album5", "pop", "2004");

        albumRepository.save(album1);
        albumRepository.save(album2);
        albumRepository.save(album3);
        albumRepository.save(album4);
        albumRepository.save(album5);

        songRepository.save(new Song("I Wish", "Pop", 2010, album1));
        songRepository.save(new Song("Too many reasons", "Hip hop", 2011, album4));
        songRepository.save(new Song("Sip", "Rock", 2012, album3));
        songRepository.save(new Song("Back Outside", "Classic rock", 2013, album5));
        songRepository.save(new Song("Eyes Don't Lie", "Electronic", 2014, album2));
    }
}
