//Doação de Sangue

import java.util.Scanner;

public class AtvidadeTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira sua idade:");
        int age = sc.nextInt();

        System.out.println("Insira seu peso em kg:");
        double weight = sc.nextInt();

        if (((age >= 18) || (age <= 67)) && (weight > 50)) {
            System.out.println("Pode doar sangue.");
        } else {
            System.out.println("Não pode doar sangue.");
        }
        sc.close();
    }
}
