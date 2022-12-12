package animalfarm.animals;

public class Cow extends Mammal {
    public static final String NOISE = "Moo";
    public Cow(int weight) {
        super(weight, NOISE);
    }

    @Override
    public Mammal giveBirth() {
        Cow babyCow = new Cow(generateRandomBabyWeight());
        weight -= babyCow.weight;
        return babyCow;
    }
}
