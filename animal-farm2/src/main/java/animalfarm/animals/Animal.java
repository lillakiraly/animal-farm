package animalfarm.animals;

import java.util.UUID;

public abstract class Animal {
    protected int weight;
    private UUID id;
    protected String noise;

    public Animal(int weight, String noise) {
        this.weight = weight;
        this.noise = noise;
        id = UUID.randomUUID();
    }

    public String makeNoise() {
        return noise;
    }
}
