package esprit.gestionzoo.main;

import esprit.gestionzoo.entities.Animal;
import esprit.gestionzoo.entities.Zoo;

import java.util.Scanner;
public class ZooManagement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nbrCages = 20;
        String zooName = "my zoo";

        System.out.println(zooName + " comporte " + nbrCages + " cages");
        System.out.print("Entrez le nombre de cages à gérer : ");

        while (!scanner.hasNextInt()) {
            System.out.println("Veuillez entrer un nombre valide.");
            scanner.next();
        }

        nbrCages = scanner.nextInt();

        System.out.print("Entrez le nom du zoo à gérer : ");

        zooName = scanner.next();

        System.out.println("Les informations du zoo ont été mises à jour :");
        System.out.println(zooName + " comporte " + nbrCages + " cages");

        Animal lion = new Animal("Panthera leo persica", "Lion", 5, true);
        Animal crocodile = new Animal("Crocodilidé", "Crocodile", 10, false);
        Animal loup = new Animal("Canidé", "Loup", 7, true);
        Animal girafe = new Animal("Girafidé", "Girafe", 8, true);

        //lion.displayAnimal();

        //System.out.println(lion);
        //System.out.println(lion.toString());

        Animal lionn = new Animal("Panthera leo persica", "Lion", 5, true);

        Zoo myZoo = new Zoo("Bélvédère", "Tunis");

        if (myZoo.isZooFull()) {
            System.out.println("Le zoo est plein.");
        } else {
            System.out.println("Le zoo n'est pas plein.");
        }

        myZoo.addAnimal(lion);
        myZoo.addAnimal(crocodile);
        myZoo.addAnimal(loup);
        myZoo.addAnimal(girafe);

        myZoo.displayZoo();

        //System.out.println(myZoo);
        //System.out.println(myZoo.toString());

        int index = myZoo.searchAnimal("Lion");
        if (index != -1) {
            System.out.println("L'animal a été trouvé à l'indice : " + index);
        } else {
            System.out.println("L'animal n'a pas été trouvé dans le zoo.");
        }

        Zoo zoo1 = new Zoo("Zoo1", "Sousse");
        Zoo zoo2 = new Zoo("Zoo2", "Gafsa");

        Zoo zooAvecPlusAnimaux = Zoo.comparerZoo(zoo1, zoo2);

        if (zooAvecPlusAnimaux != null) {
            System.out.println("Le zoo avec le plus d'animaux est : " + zooAvecPlusAnimaux.name);
        } else {
            System.out.println("Les deux zoos ont le même nombre d'animaux.");
        }

        scanner.close();
    }
}