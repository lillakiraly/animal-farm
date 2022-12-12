package animalfarm;

import animalfarm.animals.Animal;
import animalfarm.animals.Goose;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AnimalFarm {
    private Set<Animal> animals;

    public AnimalFarm(Animal ... animals) {
        this.animals = new HashSet<>();
        this.animals.addAll(List.of(animals));
    }

    public void interactWithAnimals() {
        animals.forEach(animal -> System.out.println(animal.makeNoise()));
    }

    public Goose findGooseWithHighestEggCount() {
        return animals.stream().filter(animal -> animal instanceof Goose)
                .map(animal -> (Goose) animal)
                .max(Comparator.comparingInt(Goose::getEggCounter)).orElse(null);
    }
}
