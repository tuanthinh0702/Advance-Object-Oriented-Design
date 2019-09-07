package animal;

import edible.Edible;

public class Chicken extends Animal implements Edible {

    public String makesound() {
        return "Chicken: cluck-cluck";
    }

    public String howToEat() {
        return "could be fried";
    }
}
