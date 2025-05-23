package at.technikum.springrestbackend.controller;

import at.technikum.springrestbackend.entity.Kartei;
import at.technikum.springrestbackend.entity.User;
import at.technikum.springrestbackend.repository.KarteiRepository;
import at.technikum.springrestbackend.repository.UserRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/dummydata")
public class DummyDataController {

    private final UserRepository userRepository;
    private final KarteiRepository karteiRepository;

    public DummyDataController(UserRepository userRepository, KarteiRepository karteiRepository) {
        this.userRepository = userRepository;
        this.karteiRepository = karteiRepository;
    }

    @PostMapping("/dodataset1")
    public @ResponseBody String doDummyDataset1() {
        // do stuff

        try {
            User user1 = new User("Jane", "Doe");
            User user2 = new User("John", "DifferentDoe");
            this.userRepository.save(user1);
            this.userRepository.save(user2);

            Kartei kartei1 = new Kartei(user1, "Lernkarte für Bollards", "Für geoguessr");
            Kartei kartei2 = new Kartei(user2, "Wiener Bezirke", "Es gibt 23 Wiener Bezirke");

            this.karteiRepository.save(kartei1);
            this.karteiRepository.save(kartei2);

            return "done for now. oder so.";
        } catch (RuntimeException e) {
            return "foobar: "+e.toString() ;
        }
    }


}
