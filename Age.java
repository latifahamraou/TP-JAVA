import java.util.Scanner;

public class Age {
    public static void main(String arg[]) {
        int age;
        System.out.println("*********************************************************************************************************");
        System.out.println("Bienvenue sur  le programmme permettant d'informer sur la catégorie d'un enfant  en fonction de son âge");
        System.out.println("*********************************************************************************************************");
        System.out.println("Entrer votre age  :");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
       if(age>=6 && age<=7){
            System.out.println("Votre enfant est dans la catégorie poussin");
        }
        if(age>=8 && age<=9){
            System.out.println("Votre enfant est dans la catégorie pupille");
        }
        if(age>=10 && age<=11){
            System.out.println("Votre enfant est dans la catégorie minime");
        }
        if(age>=12){
            System.out.println("Votre enfant est dans la catégorie cadet");
        }

    }
}
