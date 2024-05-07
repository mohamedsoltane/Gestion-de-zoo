package tn.esprit.gestionzoo.entities;

import esprit.gestionzoo.entities.Animal;
import interfaces.Food;
import interfaces.Omnivors;

public class Terrestrial extends Animal implements Omnivors<Food> {
    protected int nbrLegs;

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println("L'animal terrestre mange de la viande.");
        } else {
            System.out.println("L'animal terrestre ne mange pas ce type de nourriture.");
        }
    }

    @Override
    public void eatPlant(Food plant) {
        if (plant == Food.PLANT || plant == Food.BOTH) {
            System.out.println("L'animal terrestre mange des plantes.");
        } else {
            System.out.println("L'animal terrestre ne mange pas ce type de nourriture.");
        }
    }

    @Override
    public void eatPlantAndMeat(Food food) {
        if (food == Food.BOTH) {
            System.out.println("L'animal terrestre mange à la fois de la viande et des plantes.");
        } else {
            System.out.println("L'animal terrestre ne mange pas ce type de nourriture.");
        }
    }
}
