package marcowidesott.BackW1M2D4.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class Bibite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int calorie;
    private double price;
    private String nome;

    public Bibite(int calorie, double price, String nome) {
        this.calorie = calorie;
        this.price = price;
        this.nome = nome;
    }
}
