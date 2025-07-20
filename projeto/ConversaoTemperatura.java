package projeto;
import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(
                "Você gostaria de converter a temperatura para Celsius ou Fahrenheit? \nDigite C para Celsius ou F para Fahrenheit com letras maiúsculas!");
        String temperatura = scanner.next();
        if (temperatura.equals("F")) {
            System.out.println("Digite o valor em Celsius: ");
            double entradaTemperatura = scanner.nextDouble();
            System.out.printf("Fahrenheit = %.1f",  + CelsiusParaFahrenheit(entradaTemperatura));

        } else if (temperatura.equals("C")) {
            System.out.println("Digite o valor em Fahrenheit: ");
            double entradaTemperatura = scanner.nextDouble();
            System.out.printf("Celsius = %.1f", FahrenheitParaCelsius(entradaTemperatura));

        } else {
            System.out.println("Operação inválida. Digite somente C ou F!");
        }

        scanner.close();
    }

    public static double CelsiusParaFahrenheit(double temperatura) {
        return (temperatura * 9 / 5) + 32;
    }

    public static double FahrenheitParaCelsius(double temperatura) {
        return (temperatura - 32) * 5 / 9;
    }
}

