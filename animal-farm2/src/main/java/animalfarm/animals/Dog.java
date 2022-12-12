package animalfarm.animals;

public class Dog extends Mammal {
    private static final String NOISE = "Woof";
    private static final int DUGGED_UP_HOLES_LIMIT = 10;
    private int duggedUpHoles;
    private DogType type;

    public Dog(int weight, DogType type) {
        super(weight, NOISE);
        this.type = type;
        duggedUpHoles = 0;
    }

    @Override
    public Mammal giveBirth() {
        Dog babyDog = new Dog(generateRandomBabyWeight(), type);
        weight -= babyDog.weight;
        return babyDog;
    }

    public void dugHole() {
        if (isAllowedToDugHole()) {
            duggedUpHoles++;
        }
    }

    private boolean isAllowedToDugHole() {
        return duggedUpHoles <= DUGGED_UP_HOLES_LIMIT;
    }
}
