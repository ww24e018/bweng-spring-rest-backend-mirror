package at.technikum.springrestbackend.controller;


import at.technikum.springrestbackend.dto.KarteiDto;
import at.technikum.springrestbackend.entity.Kartei;
import at.technikum.springrestbackend.repository.KarteiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(path = "/kartei")
public class KarteiController {

    @Autowired
    private KarteiRepository karteiRepository;

    @PostMapping(path = "/add-defunct-deprecated-example")
    public @ResponseBody String addNewKartei(
            @RequestParam String name,
            @RequestParam String beschreibung) {

        Kartei k = new Kartei();
        k.setName(name);
        k.setBeschreibung(beschreibung);
        karteiRepository.save(k);
        return "saved";
    }

    @GetMapping(path = "/{id}")
    public @ResponseBody KarteiDto getKarteiDtoById(@PathVariable Integer id) {
        KarteiDto karteiDto = new KarteiDto(
                this.karteiRepository.getKarteiById(id)
        );
        return karteiDto;
    }

    @GetMapping(path = "/all/onlyids")
    public @ResponseBody List<Integer> getIdsOfAllKarteien() {
        Iterable<Kartei> karteien = karteiRepository.findAll();
        List<Integer> allIds = new ArrayList<Integer>();
        for (Kartei kartei : karteien) {
            allIds.add(kartei.getId());
        }
        return allIds;
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<KarteiDto> getAllKarteien() {
        return KarteiDto.mapKarteienIterableToDtoIterable(karteiRepository.findAll());
    }

}
