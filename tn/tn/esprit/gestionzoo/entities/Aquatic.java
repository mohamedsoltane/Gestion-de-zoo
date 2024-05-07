// Aquatic.java
package tn.esprit.gestionzoo.entities;


import esprit.gestionzoo.entities.Animal;

public abstract class Aquatic extends Animal {
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
