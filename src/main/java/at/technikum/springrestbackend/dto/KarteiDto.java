package at.technikum.springrestbackend.dto;

import java.util.ArrayList;
import java.util.List;

import at.technikum.springrestbackend.entity.Kartei;

public class KarteiDto {

    private Integer id ;
    private String name ;
    private String beschreibung ;
    private boolean isPublic ;
    private UserDto user ;

    
    public KarteiDto(Kartei kartei) {
        this.id = kartei.getId();
        this.name = kartei.getName();
        this.beschreibung = kartei.getBeschreibung();
        this.isPublic = kartei.getIsPublic();
        this.user = new UserDto(kartei.getUser());
    }

    public static Iterable<KarteiDto> mapKarteienIterableToDtoIterable(Iterable<Kartei> karteien) {
        List<KarteiDto> karteiDtos = new ArrayList<KarteiDto>();
        for (Kartei kartei : karteien) {
            karteiDtos.add(new KarteiDto(kartei));
        }
        return karteiDtos;
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
    public boolean isPublic() {
        return isPublic;
    }
    public void setPublic(boolean isPublic) {
        this.isPublic = isPublic;
    }
    public UserDto getUser() {
        return user;
    }
    public void setUser(UserDto user) {
        this.user = user;
    }

    


}
