package at.technikum.springrestbackend.controller;


import at.technikum.springrestbackend.entity.Kartei;
import at.technikum.springrestbackend.repository.KarteiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/kartei")
public class KarteiController {

    @Autowired
    private KarteiRepository karteiRepository;

    @PostMapping(path = "/add")
    public @ResponseBody String addNewKartei(
            @RequestParam String name,
            @RequestParam String beschreibung) {

        Kartei k = new Kartei();
        k.setName(name);
        k.setBeschreibung(beschreibung);
        karteiRepository.save(k);
        return "saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Kartei> getAllKarteien() {
        return karteiRepository.findAll();
    }

}
