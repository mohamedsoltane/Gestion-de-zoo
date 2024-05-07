package esprit.gestionzoo.entities;
public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        setAge(age);
        this.isMammal = isMammal;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("L'âge ne peut pas être négatif.");
        }
    }
    public void setName(String name) {
        this.name = name;
    }
    public void displayAnimal() {
        System.out.println("Animal name: " + name);
        System.out.println("Family: " + family);
        System.out.println("Age: " + age);
        System.out.println("Is mammal: " + isMammal);
    }
    @Override
    public String toString() {
        return "Animal: " + name + "\n" +
                "Family: " + family + "\n" +
                "Age: " + age + "\n" +
                "Is mammal: " + isMammal;
    }

    public void swim() {
    }
}
