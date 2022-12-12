package animalfarm.animals;

public class Cat extends Mammal {
    private static final String NOISE = "Meow";

    public Cat(int weight) {
        super(weight, NOISE);
    }

    @Override
    public Mammal giveBirth() {
        Cat babyCat = new Cat(generateRandomBabyWeight());
        weight -= babyCat.weight;
        return babyCat;
    }
}
