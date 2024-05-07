package esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.entities.Aquatic;
import tn.esprit.gestionzoo.entities.Penguin;
import tn.esprit.gestionzoo.entities.Dolphin;
public class Zoo {
    static final int MAX_CAGES = 25;
    Animal[] animals;
    Animal[] aquaticAnimals;
    static final int MAX_AQUATIC_ANIMALS = 10;
    public String name;
    String city;
    int animalsCount;
    public Zoo(String name, String city) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Le nom du zoo ne peut pas être vide.");
        }
        this.city = city;
        animals = new Animal[MAX_CAGES];
        aquaticAnimals = new Animal[MAX_AQUATIC_ANIMALS];
        this.animalsCount = 0;

    }

    public void displayZoo() {
        System.out.println("Zoo name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of cages: " + MAX_CAGES);
    }
    @Override
    public String toString() {
        return "Zoo name: " + name + "\n" +
                "City: " + city + "\n" +
                "Number of cages: " + MAX_CAGES;
    }
    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("Le zoo est plein, aucun nouvel animal ne peut être ajouté.");
            return false;
        }

        for (int i = 0; i < animalsCount; i++) {
            if (animals[i].equals(animal)) {
                System.out.println("L'animal existe déjà dans le zoo.");
                return false;
            }
        }
        animals[animalsCount] = animal;
        animalsCount++;
        return true;
    }
    public void displayAnimals() {
        System.out.println("Animaux du zoo:");
        for (int i = 0; i < animalsCount; i++) {
            System.out.println("Animal " + (i+1) + ": " + animals[i].getName());
        }
    }
    public int searchAnimal(String animalName) {
        for (int i = 0; i < animalsCount; i++) {
            if (animals[i].getName().equals(animalName)) {
                return i;
            }
        }
        return -1;
    }
    public boolean removeAnimal(Animal animal) {
        for (int i = 0; i < animalsCount; i++) {
            if (animals[i].equals(animal)) {
                for (int j = i; j < animalsCount - 1; j++) {
                    animals[j] = animals[j + 1];
                }

                animalsCount--;
                animals[animalsCount] = null;
                return true;
            }
        }
        return false;
    }

    public void addAquaticAnimal(Aquatic aquatic) {
        int aquaticAnimalsCount = 0;
        if (aquaticAnimalsCount < MAX_AQUATIC_ANIMALS) {
            aquaticAnimals[aquaticAnimalsCount] = aquatic;
            aquaticAnimalsCount++;
            System.out.println("Aquatic animal added to the zoo: " + aquatic.getName());
        } else {
            System.out.println("Maximum number of aquatic animals reached. Cannot add more.");
        }
    }

    public void swimAllAquaticAnimals() {
        System.out.println("Swimming all aquatic animals in the zoo:");
        int aquaticAnimalsCount = 0;
        for (int i = 0; i < aquaticAnimalsCount; i++) {
            aquaticAnimals[i].swim();
        }
    }


    public boolean isZooFull() {
        return animalsCount >= MAX_CAGES;
    }
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.animalsCount > z2.animalsCount) {
            return z1;
        } else if (z2.animalsCount > z1.animalsCount) {
            return z2;
        } else {
            return null;
        }
    }


    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0.0f;


        int aquaticAnimalsCount = 0;
        for (int i = 0; i < aquaticAnimalsCount; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                Penguin penguin = (Penguin) aquaticAnimals[i]; 
                float swimmingDepth = penguin.getSwimmingDepth(); 
                if (swimmingDepth > maxDepth) {
                    maxDepth = swimmingDepth;
                }
            }
        }

        return maxDepth;
    }

    public void displayNumberOfAquaticsByType() {
        int numberOfDolphins = 0;
        int numberOfPenguins = 0;

        int aquaticAnimalsCount = 0;
        for (int i = 0; i < aquaticAnimalsCount; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                numberOfDolphins++;
            } else if (aquaticAnimals[i] instanceof Penguin) {
                numberOfPenguins++;
            }
        }

        System.out.println("Number of dolphins: " + numberOfDolphins);
        System.out.println("Number of penguins: " + numberOfPenguins);
    }



}