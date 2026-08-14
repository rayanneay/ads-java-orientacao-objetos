import java.util.Scanner;

public class MaiorDeTres {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um número:");
        int num1 = sc.nextInt();

        System.out.print("Insira outro número:");
        int num2 = sc.nextInt();

        System.out.print("Insira um número:");
        int num3 = sc.nextInt();

        if ((num1 > num2) && (num1 > num3)) {
            System.out.print("O número " + num1 + " é maior!");
        } else if ((num2 > num1) && (num2 > num3)) {
            System.out.print("O número " + num2 + " é maior!");
        } else {
            System.out.print("O número " + num3 + " é maior!");
        }

        sc.close();
    }
}
