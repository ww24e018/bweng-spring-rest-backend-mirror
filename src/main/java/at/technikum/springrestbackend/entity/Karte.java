package at.technikum.springrestbackend.entity;

import jakarta.persistence.*;

@Entity
public class Karte {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id ;

    @ManyToOne
    @JoinColumn(name = "kartei_id")
    private Kartei kartei ;
    private String fragetext ;
    private String frageMediaURL ;
    private String antworttext ;

    public Kartei getKartei() {
        return kartei;
    }

    public void setKartei(Kartei kartei) {
        this.kartei = kartei;
    }
}
