/**
 * TestSwitch
 */
import java.util.Scanner;
public class TestSwitch {

    public static void nameTestSwitch() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nom de l'utilisateur que vous préférez");
        String name = scanner.nextLine();
        // le switch doit être du même type que ce qui sont rentré dans le switch Case
        switch (name) {
            case "Gamara":
                System.out.println("tu es " + name);
                break;
            case "Joshua":
                System.out.println("tu es " + name);
                break;
            case "Stamina":
                System.out.println("tu es " + name);
                break;
            default:
                System.out.println("il n y pas d'option pour ceci ");
        }

        //  fermer le scanner pour eviter la perte des ressources
        scanner.close();
    }
}