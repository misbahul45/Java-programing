package learn.app;

import learn.data.Costumer;
import learn.data.Level;

public class CostumerApp {
    public static void main(String[] args) {
        var costumer = new Costumer();
        costumer.setName("Misbahul");
        costumer.setLevel(Level.PREMIUM);

        System.out.println(costumer.getName());
        System.out.println(costumer.getLevel());
        System.out.println(costumer.getLevel().getDescription());

        // convert enum ke string
        Level standartString = Level.valueOf("STANDART");

        System.out.println("String Enum " + standartString);

        System.out.println("Array enums string");
        Level[] levels = Level.values();
        for (Level level : levels) {
            System.out.println(level);
        }

    }
}
