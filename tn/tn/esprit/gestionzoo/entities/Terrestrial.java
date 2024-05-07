package tn.esprit.gestionzoo.entities;

import esprit.gestionzoo.entities.Animal;

public class Terrestrial extends Animal {
    protected int nbrLegs;

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }
}
