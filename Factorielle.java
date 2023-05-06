import java.util.Scanner;

public class Factorielle {
        public static void main(String arg[]) {
            int nombre, factoriel = 1;
            System.out.println("*********************************************************************************************************");
            System.out.println("Binevenue sur  le programmme permettant de calculer la sommes des n ");
            System.out.println("*********************************************************************************************************");
            System.out.println("Entrer un nombre  :");
            Scanner sc = new Scanner(System.in);
            nombre = sc.nextInt();

                for(int i=1; i<=nombre; i++){
                    factoriel*=i;
                }


            System.out.println("La factorielle du nombre " +nombre+ " est : " +factoriel);
        }
}
