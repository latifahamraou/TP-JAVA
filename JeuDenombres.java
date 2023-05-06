import java.util.Scanner;

public class JeuDenombres {
    public static void main(String arg[]) {
        int nombre;
        System.out.println("*********************************************************************************************************");
        System.out.println("Bienvenue sur  le programmme permettant de determiner si un nombre est compris entre 10 et 20 ");
        System.out.println("*********************************************************************************************************");
        System.out.println("Entrer un nombre compris entre 10 et 20  :");
        Scanner sc = new Scanner(System.in);
        nombre = sc.nextInt();
        while (nombre < 10 || nombre > 20) {
            if (nombre < 10) {
                System.out.println("Non, plus grand:");
                nombre = sc.nextInt();
            }
            if (nombre > 20) {
                System.out.println("Non, plus petit");
                nombre = sc.nextInt();
            }
        }
        System.out.println("Le nombre est bon");
    }
    }