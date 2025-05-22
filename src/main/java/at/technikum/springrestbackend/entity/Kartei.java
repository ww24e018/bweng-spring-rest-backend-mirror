package at.technikum.springrestbackend.entity;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

// trying https://spring.io/guides/gs/accessing-data-mysql

@Entity
public class Kartei {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id ;
    private String name;
    private String beschreibung;
    private Boolean isPublic;

    // IntelliJ strongly suggests this, referencing spring/boot
    // the "user_id" column name drops from nowhere, but let's try it I guess
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user ;

    // @JsonIgnore Note for future use;
    @OneToMany(mappedBy = "kartei") // java attribut name
    private List<Karte> karten ;

    // Constructor now


    public Kartei() {
        this.name = "";
        this.beschreibung = "";
        this.isPublic = Boolean.FALSE;
        this.karten = new ArrayList<Karte>();
        // let user be null per default
    }
    public Kartei(User user) {
        this();
        this.user = user;
    }
    public Kartei(User user, String name, String beschreibung) {
        this(user);
        this.name = name;
        this.beschreibung = beschreibung;
    }


    public List<Karte> getKarten() {
        return karten;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

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

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public Boolean getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }

}
