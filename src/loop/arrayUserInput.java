package loop;

import java.util.Scanner;
public class arrayUserInput {
    
    public static void UserInput(){
        // entrer la longueur du tableau 
        System.out.println("Entrer la longueur du tableau");
        Scanner sc = new Scanner(System.in); 

        int len = sc.nextInt();  
        System.out.println("Entrer les éléments du tableau");

        // implement array 
        int[] numbers = new int [len];

        for(int i=0 ; i <len ; i++){
            numbers[i] = sc.nextInt();
        }

        // listez les éléments qui sont dans le tableau 
        for (int i =0 ;  i <len ; i++){
            System.out.println(numbers[i] + " ");
        }


        // effectuer la somme des éléments dans le tableau 
        int sum = 0; 
        for(int i =0 ; i < len ; i++){
            sum = numbers[i] + sum;
        }

        // Afficher la somme des éléments 
        System.out.println("La somme des éléments est : " + sum);
        sc.close();
    }
}
