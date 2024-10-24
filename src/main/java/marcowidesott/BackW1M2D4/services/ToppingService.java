package marcowidesott.BackW1M2D4.services;

import marcowidesott.BackW1M2D4.entities.Topping;
import marcowidesott.BackW1M2D4.repositories.ToppingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToppingService {

    @Autowired
    private ToppingRepository toppingRepository;

    public List<Topping> getAllToppings() {
        return toppingRepository.findAll();
    }

    public Topping addTopping(Topping topping) {
        return toppingRepository.save(topping);
    }

    public void deleteTopping(Long id) {
        toppingRepository.deleteById(id);
    }
}
