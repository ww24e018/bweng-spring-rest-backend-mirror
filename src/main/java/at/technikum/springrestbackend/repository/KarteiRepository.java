package at.technikum.springrestbackend.repository;

import at.technikum.springrestbackend.entity.Kartei;
import org.springframework.data.repository.CrudRepository;

public interface KarteiRepository extends CrudRepository<Kartei, Integer> {
    Kartei getKarteiById(Integer id);
}
