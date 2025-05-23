package at.technikum.springrestbackend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)  // Methode von Tutorial von Moodle EH3/SelfStudy
    private Integer id ;

    private String profilepictureURL ;

    @Email
    @NotBlank
    private String email ;
    private String anrede ;
    private String vorname ;
    private String nachname ;
    private String passwordHash ;
    private String land ; // iso code?

    // kein eigen-definierter Constructor for now? siehe ILV

    public User() {
        this.anrede = "";
        this.profilepictureURL = "";
        this.email = "";
        this.vorname = "";
        this.nachname = "";
        this.land = "at";
        this.passwordHash = "";
    }
    public User(String vorname, String nachname) {
        this();
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProfilepictureURL() {
        return profilepictureURL;
    }

    public void setProfilepictureURL(String profilepictureURL) {
        this.profilepictureURL = profilepictureURL;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAnrede() {
        return anrede;
    }

    public void setAnrede(String anrede) {
        this.anrede = anrede;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    // mal auskommentiert, weil weird sonst.
    /*public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }*/

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }
}
