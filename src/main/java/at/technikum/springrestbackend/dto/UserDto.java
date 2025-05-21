package at.technikum.springrestbackend.dto;

import at.technikum.springrestbackend.entity.User;

public class UserDto {
    
    private String profilepictureURL ;
    private String name ;


    
    public UserDto(User user) {
        if (user != null) {
            this.profilepictureURL = user.getProfilepictureURL();
            this.name = String.format("%s %s", user.getVorname(), user.getNachname());
        } else {
            this.profilepictureURL = "";
            this.name = "Dummy User 42";
        }
    }

    public String getProfilepictureURL() {
        return profilepictureURL;
    }
    public void setProfilepictureURL(String profilepictureURL) {
        this.profilepictureURL = profilepictureURL;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    

}
