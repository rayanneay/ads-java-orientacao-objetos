//Nome da figura geométrica

import java.util.Scanner;

public class AtividadeCinco {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o número de lados:");

        int sides = sc.nextInt();

       switch (sides) {
        case 3:
            System.out.println("A figura é um triângulo.");
            break;
        case 4:
            System.out.println("A figura é um Quadrado ou Retângulo.");
            break;
        case 5:
            System.out.println("A figura é um Pentágono.");
            break;
        case 6:
            System.out.println("A figura é um Hexágono.");
            break;
        default:
            System.out.println("Número de lados sem definição pelo sistema.");
            break;
       }
        
        sc.close();
    }
}
