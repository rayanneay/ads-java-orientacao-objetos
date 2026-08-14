// Preço das maçãs por quantidade
import java.util.Scanner;

public class AtividadeQuatro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas maçãs vamos comprar hoje?");

        int quantidade = sc.nextInt();

        if(quantidade < 0) {
            System.out.println("Não se é aceito quantidades negativas.");
        } else if (quantidade < 12) {
            double preco = quantidade * 1.30;
            System.out.println("O preço das maçãs ficam em: " + preco);
        } else {
            double preco = quantidade * 1;
            System.out.println("O preço das maçãs ficam em: " + preco);
        }
        
        sc.close();
    }
}
