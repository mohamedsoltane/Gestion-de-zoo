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

            lion.displayAnimal();

            System.out.println(lion);
            System.out.println(lion.toString());

            Zoo myZoo = new Zoo("Bélvédère", "Tunis", 25);

            myZoo.displayZoo();

            System.out.println(myZoo);
            System.out.println(myZoo.toString());

            scanner.close();
        }
    }