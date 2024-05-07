import java.util.Scanner;

    public class ZooManagment {
    public static void main(String[] args) {
        int nbrCages = 20;
        String zooName = "my zoo";

        System.out.println(zooName + " comporte " + nbrCages + " cages");

        Scanner scanner = new Scanner(System.in);

        System.out.print(" Entrez le nombre de cages à gérer : ");
        while (!scanner.hasNextInt()) {
            System.out.println(" Veuillez entrer un nombre valide ");
            scanner.next();
        }
        nbrCages = scanner.nextInt();
        System.out.print("Entrez le nom du zoo à gérer : ");
        zooName = scanner.next();

        System.out.println(" Les informations du zoo ont été mises à jour : ");
        System.out.println(zooName + " comporte " + nbrCages + " cages");

        scanner.close();
    }
}