package one.digitalinnovation.personal.api.repository;

import one.digitalinnovation.personal.api.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
