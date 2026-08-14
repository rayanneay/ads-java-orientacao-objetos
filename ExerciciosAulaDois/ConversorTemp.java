// Leia uma temperatura em Celsius e mostre o valor
// em Fahrenheit.
import java.util.Scanner;

public class ConversorTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira a temperatura em celsius:");
        double tempCelsius = sc.nextDouble();

        double tempFahrenheit = ((tempCelsius * 1.8) + 32);

        System.out.print("A temperatura em fahrenheit é de:" + tempFahrenheit + ".");

        sc.close();
    }
}
