// Maior e menor de N números

import java.util.Scanner;

public class AtividadeOito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos números deseja digitar? ");
        int quantidade = sc.nextInt();

        if (quantidade <= 0) {
            System.out.println("A quantidade deve ser maior que zero.");
        } else {
            System.out.print("Digite o 1º número: ");
            int numero = sc.nextInt();

            int maior = numero;
            int menor = numero;

            for (int i = 2; i <= quantidade; i++) {
                System.out.print("Digite o " + i + "º número: ");
                numero = sc.nextInt();

                if (numero > maior) {
                    maior = numero;
                }

                if (numero < menor) {
                    menor = numero;
                }
            }

            System.out.println("Maior valor digitado: " + maior);
            System.out.println("Menor valor digitado: " + menor);
        }
        
        sc.close();
    }
}
