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
@Getter
@Setter
public class Topping {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int calorie;
    private double prezzo;
    private String nome;

    public Topping(int calorie, String nome, double prezzo) {
        this.calorie = calorie;
        this.nome = nome;
        this.prezzo = prezzo;
    }
}
