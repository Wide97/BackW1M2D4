package marcowidesott.BackW1M2D4.repositories;

import marcowidesott.BackW1M2D4.entities.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Long> {
}
