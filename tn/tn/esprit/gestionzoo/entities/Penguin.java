package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic {
    protected float swimmingDepth;

    public Penguin(String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super("Spheniscidae", name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }
    @Override
    public String toString() {
        return super.toString() + ", Swimming depth: " + swimmingDepth;
    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }
@Override
    public void swim() {
        System.out.println("This penguin is swimming.");
    }
}
