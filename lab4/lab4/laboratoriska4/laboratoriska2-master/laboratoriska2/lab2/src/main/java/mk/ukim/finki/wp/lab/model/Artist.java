package mk.ukim.finki.wp.lab.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Getter
@Entity
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    String firstName;

    String lastName;

    String bio;

    @ManyToMany(mappedBy = "performers")
    private List<Song> songs;

    public Artist(String firstName, String lastName, String bio, List<Song> songs) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bio = bio;
        this.songs = songs;
    }

    public Artist() {

    }
}
