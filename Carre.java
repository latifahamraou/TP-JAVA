import java.util.Scanner;

public class Carre {
    public static void main(String arg[]) {
        int nombre, carre;
        System.out.println("****************************************************************************");
        System.out.println("Binevenue sur  le programmme permettant de calculer le carré d'un nombre:");
        System.out.println("****************************************************************************");
        System.out.println("Entrer un nombre :");
        Scanner sc = new Scanner(System.in);
        nombre = sc.nextInt();
        //carre = nombre * nombre;
        carre=(int) Math.sqrt(nombre);
        System.out.println("Le carré du nombre "+nombre+ " est: " +carre);
    }
}
