
package collections;
import java.util.HashMap;

public class DictionaryExample {
    public static void main(String[] args) {
        // Créer un dictionnaire pour stocker des mots et leurs significations
        HashMap<String, String> dictionary = new HashMap<>();

        // Ajouter des mots et leurs significations au dictionnaire
        dictionary.put("apple", "pomme");
        dictionary.put("book", "livre");
        dictionary.put("car", "voiture");

        // Accéder à la signification d'un mot spécifique
        String meaningOfApple = dictionary.get("apple");
        System.out.println("La signification de 'apple' est : " + meaningOfApple);

        // Modifier la signification d'un mot
        dictionary.put("book", "ouvrage");
        System.out.println("La nouvelle signification de 'book' est : " + dictionary.get("book"));

        // Supprimer un mot du dictionnaire
        dictionary.remove("car");
        System.out.println("Après suppression de 'car', le dictionnaire devient : " + dictionary);
    }
}
