package animalfarm.animals;

import java.util.Random;

public abstract class Mammal extends Animal {
    private static final int MIN_BABY_WEIGHT = 100;
    private static final int MAX_BABY_WEIGHT = 500;

    public Mammal(int weight, String noise) {
        super(weight, noise);
    }

    public abstract Mammal giveBirth();

    protected int generateRandomBabyWeight() {
        Random random = new Random();
        return random.nextInt(MIN_BABY_WEIGHT, MAX_BABY_WEIGHT);
    }
}
