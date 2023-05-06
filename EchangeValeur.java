import java.util.Scanner;

public class EchangeValeur {
    public static void main(String[] arg) {
        int valeurUn, valeurDeux, valeurTemporaire;
        System.out.println("****************************************************************************");
        System.out.println("Binevenue sur  le programmme permettant d'échanger les valeurs de 2 nombres:");
        System.out.println("****************************************************************************");
        System.out.println("Entrer  la première valeur :");
        Scanner sc1 = new Scanner(System.in);
        valeurUn = sc1.nextInt();
        System.out.println("Entrer la deuxième valeur :");
        Scanner sc2 = new Scanner(System.in);
        valeurDeux = sc2.nextInt();
        valeurTemporaire = valeurUn;
        valeurUn = valeurDeux;
        valeurDeux = valeurTemporaire;
        System.out.println("Les nouvelles valeurs sont: a=" + valeurUn + " et b=" + valeurDeux);


    }

}
