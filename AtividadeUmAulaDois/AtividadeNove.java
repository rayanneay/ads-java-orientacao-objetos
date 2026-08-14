// Soma de ímpares múltiplos de 3

import java.util.Scanner;

public class AtividadeNove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        for(int number = 1; number <= 500; number++) {
            if((number % 2 != 0) && (number % 3 == 0)) {
                sum = sum + number;
            }
        }

        System.out.println("A soma dos números ímpares múltiplos de 3 é: " + sum);
    
    sc.close();
    }
}
