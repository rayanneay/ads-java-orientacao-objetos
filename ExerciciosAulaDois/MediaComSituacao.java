// Calcule a média de 3 notas e diga se o aluno foi
// aprovado (média ≥ 6).
import java.util.Scanner;

public class MediaComSituacao {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a primeira nota:");
        double nota1 = sc.nextDouble();

        System.out.print("Insira a segunda nota:");
        double nota2 = sc.nextDouble();

        System.out.print("Insira a terceira nota:");
        double nota3 = sc.nextDouble();

        double notaFinal = (nota1 + nota2 + nota3) / 3;

        if (notaFinal >= 6) {
            System.out.print("Aluno Aprovado!");
        } else {
            System.out.print("Aluno Reprovado.");
        }

        sc.close();
    }
}
