package marcowidesott.BackW1M2D4.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Entity
@Getter
@Setter
public class Pizza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int calorie;
    private double prezzo;
    private String nome;

    public Pizza(int calorie, double prezzo, String nome) {
        this.calorie = calorie;
        this.prezzo = prezzo;
        this.nome = nome;
    }
}
