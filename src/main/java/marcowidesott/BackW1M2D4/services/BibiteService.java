package marcowidesott.BackW1M2D4.services;

import marcowidesott.BackW1M2D4.entities.Bibite;
import marcowidesott.BackW1M2D4.repositories.BibiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BibiteService {

    @Autowired
    private BibiteRepository bibiteRepository;

    public List<Bibite> getAllBibite() {
        return bibiteRepository.findAll();
    }

    public Bibite addBibite(Bibite bibite) {
        return bibiteRepository.save(bibite);
    }

    public void deleteBibite(Long id) {
        bibiteRepository.deleteById(id);
    }


}
