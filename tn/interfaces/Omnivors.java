package interfaces;

public interface Omnivors<T> extends Carnivors<T>, Herbivore<T> {
    void eatPlantAndMeat(T food);
}