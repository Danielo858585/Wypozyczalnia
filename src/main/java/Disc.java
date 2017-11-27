import javax.persistence.*;

@Entity
public class Disc {
    @Id
    @Column(name = "id_disc")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String title;
    private String year;

    @OneToMany
    @JoinColumn(name = "id_song")
    private Song song;

    @OneToOne
    @JoinColumn(name = "id_artiste")
    private Artiste artiste;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }

    public Artiste getArtiste() {
        return artiste;
    }

    public void setArtiste(Artiste artiste) {
        this.artiste = artiste;
    }
}
