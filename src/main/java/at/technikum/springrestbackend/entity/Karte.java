package at.technikum.springrestbackend.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;
import java.util.UUID;

@Entity
public class Karte {

    @Id
    private String id ;

    // see https://docs.spring.io/spring-data/jpa/reference/auditing.html#jpa.auditing.configuration
    @CreationTimestamp
    private Instant createdDate;
    @UpdateTimestamp
    private Instant lastModifiedDate;

    @ManyToOne
    @JoinColumn(name = "kartei_id")
    private Kartei kartei ;

    private String fragetext ;
    private String frageMediaURL ;
    private String antworttext ;

    public Karte() {
        this.id = UUID.randomUUID().toString();
    }

    public Kartei getKartei() {
        return kartei;
    }

    public void setKartei(Kartei kartei) {
        this.kartei = kartei;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFragetext() {
        return fragetext;
    }

    public void setFragetext(String fragetext) {
        this.fragetext = fragetext;
    }

    public String getFrageMediaURL() {
        return frageMediaURL;
    }

    public void setFrageMediaURL(String frageMediaURL) {
        this.frageMediaURL = frageMediaURL;
    }

    public String getAntworttext() {
        return antworttext;
    }

    public void setAntworttext(String antworttext) {
        this.antworttext = antworttext;
    }
}
