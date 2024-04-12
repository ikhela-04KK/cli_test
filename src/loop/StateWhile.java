package loop;

import java.util.Scanner;
/**
 * while
 */
public class StateWhile {
    static Boolean stopLoop; 
    public static void StatesWhile(){
    
        stopLoop = true;
        Scanner scanner  = new Scanner(System.in);

        while (stopLoop) {
            System.out.print("Bievenu dans la boucle de standFord tapez \n true si vous que la boucle commence et \n false si ne voulez pas que la boucle commence ");
            stopLoop = Boolean.parseBoolean(scanner.nextLine());
    
            for(int i = 0 ; i <  10 ; i++){
                System.out.println(i);
            }
        }

        // fermer le scanner 
        scanner.close();
    }
}