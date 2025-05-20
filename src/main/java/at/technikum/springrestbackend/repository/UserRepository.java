package at.technikum.springrestbackend.repository;

import at.technikum.springrestbackend.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
