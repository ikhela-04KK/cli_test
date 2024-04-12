package collections;
import java.util.*; 

/**
 * listState
 */
public class listState {

    // implementez uen liste de nom 
    public ArrayList<String> listAllName(){

        // ArrayString<String> la réference de l'objet contient des paramètre c-a-d ArrayString ne passe pas , c'est ArrayString<String>

        /*
         * nameList.size permet de donner la taille de la liste
         * int n = (integer) num.get(2) donne un élément qui est à la 2eme position du tableau 
         * n.remove(4) permet de supprimer un élément dans le tableau 
         */
        ArrayList<String> nameList = new ArrayList<String>(); 
        Scanner sc = new Scanner(System.in);
        boolean stop = true;

        // ajouter des éléments dans la liste 

        while (stop == true) {
            System.out.print("Entrez le nom d un combattant de l'ancienne guerre : ");
            String name = sc.nextLine();
            if (name == "stop")
                stop = false;   // ça ne passe pas pour name ==" stop" , ni stop = false pour stortie de la boucle 
            nameList.add(name); 
        
            
        }
        sc.close();
        return nameList;
    }

    public void displayAllName(){
        ArrayList<String> aListName = listAllName(); 

        aListName.forEach((n) -> System.out.println("voici les noms de liste" + n));
    }
}