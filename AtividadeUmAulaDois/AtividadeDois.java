//Titulo de Eleitor


import java.util.Scanner;

public class AtividadeDois {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira sua idade:");

        int age = sc.nextInt();

        if (age > 70) {
            System.out.println("Seu voto é facultativo.");
        } else if (age >= 18) {
            System.out.println("Seu voto é obrgatório.");
        } else if (age >= 16) {
            System.out.println("Seu voto é facultativo.");
        } else {
            System.out.println("Você não pode votar.");
        }

        sc.close();
    }
}
