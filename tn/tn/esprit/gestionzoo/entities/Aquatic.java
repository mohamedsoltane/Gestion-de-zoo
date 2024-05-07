package tn.esprit.gestionzoo.entities;

import esprit.gestionzoo.entities.Animal;
import interfaces.Carnivors;
import interfaces.Food;

public abstract class Aquatic extends Animal implements Carnivors <Food> {
    protected String habitat;

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }
    public abstract void swim();
    public String getHabitat() {
        return habitat;
    }

    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println("L'animal aquatique mange de la viande.");
        } else {
            System.out.println("L'animal aquatique ne mange pas ce type de nourriture.");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Aquatic) {

            Aquatic other = (Aquatic) obj;
            return this.getName().equals(other.getName()) &&
                    this.getAge() == other.getAge() &&
                    this.getHabitat().equals(other.getHabitat());
        }
        return false;
    }

}
