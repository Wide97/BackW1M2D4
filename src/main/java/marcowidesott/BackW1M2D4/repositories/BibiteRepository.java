package marcowidesott.BackW1M2D4.repositories;

import marcowidesott.BackW1M2D4.entities.Bibite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BibiteRepository extends JpaRepository<Bibite, Long> {
}
