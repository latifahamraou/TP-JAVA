import java.util.*;

public class Notes {
    public static void main(String arg[]) {
        int nombreEleves, nombreMoyenne = 0;
        double totalNotes=0, moyenneDeLaClasse;
        ArrayList<Double> notes = new ArrayList<Double>();
        System.out.println("*********************************************************************************************************");
        System.out.println("Bienvenue sur  le programmme permettant de renvoyer les notes supérieures à la moyenne de la  classse ");
        System.out.println("*********************************************************************************************************");
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer le nombre d'élèves :");
        nombreEleves = sc.nextInt();


        for (int i =1; i <= nombreEleves; i++) {
            System.out.println("Entrer la note de l'élève" +i +" :");
            notes.add((double)sc.nextInt());
            totalNotes +=notes.get(i-1);
        }
        moyenneDeLaClasse = totalNotes/notes.size();

        for (int i = 1; i <= nombreEleves; i++) {
            if(notes.get(i-1) >= moyenneDeLaClasse){
                nombreMoyenne ++;
        }

        }
        System.out.println("Le nombre de moyenne de la classe est: "+ nombreMoyenne);
    }
}
