import java.util.Scanner;

public class Exercicio2 {
    //conversor de dolar em euro

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double valorDolar, valorFinal;
        double cotacaoEuro = 0.99;

        System.out.print("Conversor de dólar em euro\n\n");

        System.out.print("Digite a valor em dolares: ");
        valorDolar = ler.nextDouble();

        valorFinal = valorDolar * cotacaoEuro;

        System.out.print("O Valor em euros é " + valorFinal + "\n");
    }
}

