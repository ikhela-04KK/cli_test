public class wayToDisplay {


    /*
     * différence entre static et final dans une classe quand un élement à un private final static qu'est ce que cela veut dire 
     * dan quelle condition dans une methode de classe je peux utilise  une variable instancier dans le constructeur s'il a un private final
     * 
     */
    // declaration des variables 
    private static String username; 
    private static double money; 
    private static int number; 
    private static boolean reponse;
    
    public wayToDisplay(String name , double dollars, int tel, boolean faq){
        username = name;
        money = dollars; 
        number = tel; 
        reponse = faq; 

    }

    // pourquoi quand je met static ici cette methode ne peut pas être appelé dans la class principal qui as le main
    public void wayToDisplayOne(){

    // afficher avec sdtout c'est différents type de variables 
    System.out.printf("son Nom est %s" , username);
    System.out.printf("solde sur compte %.2f" , money); // limité le nombre de décimal à deux 
    System.out.printf("sa réponse à l'offre d'emploi %b" , reponse);
    System.out.printf("son numéro de téléphone %d" , number);

    }


}
