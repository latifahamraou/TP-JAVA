import java.util.Scanner;

public class Sign {
    public static void main(String arg[]) {
        int nombreUn, nombreDeux;
        System.out.println("*****************************************************************************************");
        System.out.println("Bienvenue sur  le programmme permettant de determiner le signe d'un produit de deux nombres:");
        System.out.println("*****************************************************************************************");
        System.out.println("Entrer le premier nombre :");
        Scanner sc = new Scanner(System.in);
        nombreUn = sc.nextInt();
        System.out.println("Entrer le deuxième nombre :");
        nombreDeux = sc.nextInt();
        if ((nombreUn<0 && nombreDeux <0) || (nombreUn>0 && nombreDeux >0)){
            System.out.println("Le produit des nombres est positif");
        }
        if ((nombreUn >0 && nombreDeux <0 ) || (nombreUn<0 && nombreDeux>0)) {
            System.out.println("Le produit des nombres est negatif");

        }
    }
}
