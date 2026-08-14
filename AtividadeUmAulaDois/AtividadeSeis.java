// Menu de cálculo de área

import java.util.Scanner;

public class AtividadeSeis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 - Área de um círculo");
        System.out.println("2 - Área de um retângulo");
        System.out.println("3 - Área de um quadrado");
        System.out.print("Escolha uma opção: ");

        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Informe o raio do círculo: ");
                double raio = sc.nextDouble();

                double areaCirculo = 3.14 * raio * raio;
                System.out.printf("Área do círculo: %.2f%n", areaCirculo);
                break;

            case 2:
                System.out.print("Informe a base do retângulo: ");
                double base = sc.nextDouble();

                System.out.print("Informe a altura do retângulo: ");
                double altura = sc.nextDouble();

                double areaRetangulo = base * altura;
                System.out.printf("Área do retângulo: %.2f%n", areaRetangulo);
                break;

            case 3:
                System.out.print("Informe o lado do quadrado: ");
                double lado = sc.nextDouble();

                double areaQuadrado = lado * lado;
                System.out.printf("Área do quadrado: %.2f%n", areaQuadrado);
                break;

            default:
                System.out.println("Opção inválida.");
        }

        sc.close();
    }
}