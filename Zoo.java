public class Zoo {
     Animal[] animals;
     String name;
     String city;
     int nbrCages;
    public Zoo(String name, String city, int nbrCages) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }
    public void displayZoo() {
        System.out.println("Zoo name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of cages: " + nbrCages);
    }
    public String toString() {
        return "Zoo name: " + name + "\n" +
                "City: " + city + "\n" +
                "Number of cages: " + nbrCages;
    }
}