package marcowidesott.BackW1M2D4.runner;

import marcowidesott.BackW1M2D4.entities.Bibite;
import marcowidesott.BackW1M2D4.entities.Pizza;
import marcowidesott.BackW1M2D4.entities.Topping;
import marcowidesott.BackW1M2D4.services.BibiteService;
import marcowidesott.BackW1M2D4.services.PizzaService;
import marcowidesott.BackW1M2D4.services.ToppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class MenuRunner implements CommandLineRunner {

    @Autowired
    private PizzaService pizzaService;

    @Autowired
    private BibiteService bibiteService;

    @Autowired
    private ToppingService toppingService;

    @Override
    public void run(String... args) throws Exception {
        Pizza salamino = new Pizza(200, 18.99, "Salamino");
        Pizza quattroStagioni = new Pizza(250, 19.99, "Quattro Stagioni");

        Bibite cocaCola = new Bibite(50, 5.99, "Coca Cola");
        Bibite the = new Bibite(40, 3.99, "Thè al limone");

        Topping prosciutto = new Topping(100, "Prosciutto", 1.99);
        Topping peperoni = new Topping(80, "Peperoni", 0.99);

        pizzaService.addPizza(salamino);
        pizzaService.addPizza(quattroStagioni);

        bibiteService.addBibite(cocaCola);
        bibiteService.addBibite(the);

        toppingService.addTopping(prosciutto);
        toppingService.addTopping(peperoni);

        System.out.println("Menu inizializzato");
    }
}
