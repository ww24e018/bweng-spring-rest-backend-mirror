package at.technikum.springrestbackend.entity;


import jakarta.persistence.*;

// trying https://spring.io/guides/gs/accessing-data-mysql

@Entity
public class Kartei {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id ;
    private String name ;
    private String beschreibung ;
    private boolean isPublic ;

    // IntelliJ strongly suggests this, referencing spring/boot
    // the "user_id" column name drops from nowhere, but let's try it I guess
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user ;

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
}
