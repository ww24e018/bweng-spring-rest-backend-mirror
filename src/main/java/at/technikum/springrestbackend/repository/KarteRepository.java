package at.technikum.springrestbackend.repository;

import at.technikum.springrestbackend.entity.Karte;
import org.springframework.data.repository.CrudRepository;


public interface KarteRepository extends CrudRepository<Karte, String> {
}
