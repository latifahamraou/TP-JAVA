import java.util.Scanner;

public class CalculTtc {
    public static void main(String arg[]) {
        int prixHorsTaxes, nombresArticle;
        double tva,ttc;
        System.out.println("***********************************************************************************");
        System.out.println("Bienvenue sur  le programmme permettant de calculer le prix total TTC d'un article:");
        System.out.println("***********************************************************************************");
        System.out.println("Entrer le prix HT d'un article:");
        Scanner sc = new Scanner(System.in);
        prixHorsTaxes = sc.nextInt();
        System.out.println("Entrer le nombre d'articles:");
       // Scanner sc2 = new Scanner(System.in);
        nombresArticle = sc.nextInt();
        System.out.println("Entrer le taux de la TVA:");
     //   Scanner sc3 = new Scanner(System.in);
        tva = sc.nextInt();
        ttc = (prixHorsTaxes * nombresArticle) * (tva/100) + (prixHorsTaxes * nombresArticle);

        System.out.println("Le prix total TTC correspondant est: "+ ttc);
    }

}
