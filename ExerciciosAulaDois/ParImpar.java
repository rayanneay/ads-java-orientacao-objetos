import java.util.Scanner;

public class ParImpar {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insisra um número inteiro para sabermos se ele é par ou ímpar:");

        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.print("O número é par.");
        } else {
            System.out.print("O número é ímpar.");
        }

        sc.close();
    }
}
