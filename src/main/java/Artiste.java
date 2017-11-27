import sun.util.calendar.BaseCalendar;

import javax.persistence.*;

@Entity
public class Artiste {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;
    private String nation;
    private BaseCalendar.Date date;

    @OneToMany
    @JoinColumn(name = "id_disc")
    private Disc disc;

    @OneToMany
    @JoinColumn(name = "id_song")
    private Song song;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public BaseCalendar.Date getDate() {
        return date;
    }

    public void setDate(BaseCalendar.Date date) {
        this.date = date;
    }

    public Disc getDisc() {
        return disc;
    }

    public void setDisc(Disc disc) {
        this.disc = disc;
    }

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }
}
