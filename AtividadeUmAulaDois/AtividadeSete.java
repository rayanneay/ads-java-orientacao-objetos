//Imposto de renda com consultas repetidas.

import java.util.Scanner;

public class AtividadeSete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int continuar;

        do {
            System.out.print("Informe sua renda mensal: R$ ");
            double renda = sc.nextDouble();

            double imposto;
            double aliquota;

            if (renda < 0) {
                System.out.println("A renda não pode ser negativa.");
            } else if (renda <= 1637.11) {
                System.out.println("Você está isento de imposto de renda.");
            } else {
                if (renda <= 2453.50) {
                    aliquota = 0.075;
                } else if (renda <= 3271.38) {
                    aliquota = 0.15;
                } else if (renda <= 4087.65) {
                    aliquota = 0.225;
                } else {
                    aliquota = 0.275;
                }

                imposto = renda * aliquota;

                System.out.printf("Alíquota: %.1f%%%n", aliquota * 100);
                System.out.printf("Imposto devido: R$ %.2f%n", imposto);
            }

            System.out.print("Deseja continuar? 1 - Sim | 2 - Não: ");
            continuar = sc.nextInt();

        } while (continuar == 1);

        System.out.println("Programa encerrado.");
        sc.close();
    }
}
