public class Animal {
     String family;
     String name;
     int age;
     boolean isMammal;
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    public void displayAnimal() {
        System.out.println("Animal name: " + name);
        System.out.println("Family: " + family);
        System.out.println("Age: " + age);
        System.out.println("Is mammal: " + isMammal);
    }
    public String toString() {
        return "Animal: " + name + "\n" +
                "Family: " + family + "\n" +
                "Age: " + age + "\n" +
                "Is mammal: " + isMammal;
    }
}