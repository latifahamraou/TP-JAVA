llimport java.awt.*;
import java.util.Scanner;

public class Sommes {
    public static void main(String arg[]) {
        int nombre, somme = 0;
        System.out.println("*********************************************************************************************************");
        System.out.println("Bienvenue sur  le programmme permettant de calculer la somme des n ");
        System.out.println("*********************************************************************************************************");
        System.out.println("Entrer un nombre  :");
        Scanner sc = new Scanner(System.in);
        nombre = sc.nextInt();
        for(int i=0; i<=nombre; i++){
            somme+=i;
        }
        System.out.println("La somme des n nombres est : " +somme);
    }
}
