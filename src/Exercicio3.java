import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        int x = 6;
        double y;
        double newTemperature;
        Scanner ler = new Scanner(System.in);

        System.out.println("Escolha a opção de conversão de temperatura: \n\n");
        System.out.println("Digite 1 para conversão Celsius em Kelvin");
        System.out.println("Digite 2 para conversão Kelvin em Celsius");
        System.out.println("Digite 3 para conversão Farenheit em Kelvin");
        System.out.println("Digite 4 para conversão Kelvin em Farenheit");
        System.out.println("Digite 5 para conversão Celsius em Farenheit");
        System.out.println("Digite 6 para conversão Farenheit em Celsius \n");

        System.out.println("Escolha opção: ");
        x = ler.nextInt();

        System.out.println("Digite o valor da temperatura:");
        y = ler.nextDouble();

        switch(x) {
            case 1: newTemperature = (y + 273.15);
                System.out.println("A temperatura em Kelvin será: " + newTemperature + "K");
                break;
            case 2: newTemperature = (y - 273.15);
                System.out.println("A temperatura em Celsius será: " + newTemperature + "°C");
                break;
            case 3: newTemperature = ((5 * y) + 2297)/9;
                System.out.println("A temperatura em Kelvin será: " + newTemperature + "K");
                break;
            case 4: newTemperature = ((9 * y) - 2297)/5;
                System.out.println(("A temperatura em Farenheit será: " + newTemperature + "°F"));
                break;
            case 5: newTemperature = ((9 * y) + 160)/5;
                System.out.println(("A temperatura em Farenheit será: " + newTemperature + "°F"));
                break;
            case 6: newTemperature = ((5 * y) - 160)/9;
                System.out.println("A temperatura em Celsius será: " + newTemperature + "°C");
                break;
        }
    }
}
