package tn.esprit.gestionzoo.entities;

import interfaces.Food;

public class Dolphin extends Aquatic {
    protected float swimmingSpeed;

    public Dolphin(String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super("Cetacea", name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }
    @Override
    public String toString() {
        return super.toString() + ", Swimming speed: " + swimmingSpeed;
    }
    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }

    @Override
    public void eatMeat(Food meat) {

    }
}

