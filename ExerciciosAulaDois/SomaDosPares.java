// Some todos os números pares de 1 a 100 e mostre o total.
import java.util.Scanner;

public class SomaDosPares {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int somaPar = 0;

        for(int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                somaPar += i;
            }
        }

        System.out.print(somaPar);

        sc.close();
    }
}
