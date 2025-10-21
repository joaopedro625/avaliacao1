import java.util.Scanner;

public class ConversaoTemperatura{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite a temperatura em graus Celsius (°C): ");
        double celsius = entrada.nextDouble();

        // Cálculos de conversão
        double fahrenheit = (celsius * 9 / 5) + 32;
        double kelvin = celsius + 273.15;

        // Saída dos resultados
        System.out.println("\n--- Conversão de Temperatura ---");
        System.out.printf("Temperatura em Celsius: %.2f °C%n", celsius);
        System.out.printf("Temperatura em Fahrenheit: %.2f °F%n", fahrenheit);
        System.out.printf("Temperatura em Kelvin: %.2f K%n", kelvin);

        entrada.close();
}
}
