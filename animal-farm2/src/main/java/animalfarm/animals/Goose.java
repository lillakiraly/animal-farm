package animalfarm.animals;

public class Goose extends Animal {
    private static final String NOISE = "Honk";
    private int eggCounter;

    public Goose(int weight) {
        super(weight, NOISE);
        eggCounter = 0;
    }

    public void layEgg() {
        eggCounter++;
    }

    public int getEggCounter() {
        return eggCounter;
    }
}
