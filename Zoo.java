public class Zoo {
    static final int MAX_CAGES = 25;
    Animal[] animals;
    String name;
    String city;
    int animalsCount;
    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        animals = new Animal[MAX_CAGES];
        this.animalsCount = 0;
    }

    public void displayZoo() {
        System.out.println("Zoo name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of cages: " + MAX_CAGES);
    }

    public String toString() {
        return "Zoo name: " + name + "\n" +
                "City: " + city + "\n" +
                "Number of cages: " + MAX_CAGES;
    }
    public boolean addAnimal(Animal animal) {

        for (int i = 0; i < animalsCount; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                System.out.println("L'animal existe déjà dans le zoo.");
                return false;
            }
        }

        if (animalsCount >= animals.length) {
            System.out.println("Le zoo est plein, aucun nouvel animal ne peut être ajouté.");
            return false;
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
}