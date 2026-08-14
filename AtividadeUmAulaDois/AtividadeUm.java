//Positivo, negativo ou zero

import java.util.Scanner;

public class AtividadeUm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira um número:");

        int number = sc.nextInt();

        if (number > 0) {
            System.out.print("O número é positivo. ");
            System.out.println("O triplo desse número é:" + (number * 3));
        } else if (number < 0) {
            System.out.print("O número é negativo. ");
            System.out.println("Esse número ao quadrado dá: " + (number * number));
        } else {
            System.out.print("O número é zero.");
        }

        sc.close();
    }
}