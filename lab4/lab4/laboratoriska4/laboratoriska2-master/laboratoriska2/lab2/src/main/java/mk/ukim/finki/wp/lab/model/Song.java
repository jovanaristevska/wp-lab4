package mk.ukim.finki.wp.lab.model;

import jakarta.persistence.*;
import lombok.Data;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

//@Data
@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long trackId;

    String title;

    String genre;

    Integer releaseYear;

    @ManyToMany
    private List<Artist> performers;

    @ManyToOne
    private Album album;

    public Song(String title, String genre, Integer releaseYear, Album album) {
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        performers = new ArrayList<>();
        this.album = album;
    }

    public Song() {
    }

    public Long getTrackId() {
        return trackId;
    }

    public void setTrackId(Long trackId) {
        this.trackId = trackId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public List<Artist> getPerformers() {
        return performers;
    }

    public void setPerformers(List<Artist> performers) {
        this.performers = performers;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public void addArtist(Artist performer){
        performers.add(performer);
    }


}
