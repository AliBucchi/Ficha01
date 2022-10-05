import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        //Exercicio a (convertendo real (a) em inteiro (b) e vice-versa)

        double a = 149.866;
        int b;

        b = (int) a;

        System.out.println("O valor em inteiros: " + b + "\n");

        int c = 9;

        double d = c;

        System.out.println("O valor em reais: " + d + "\n");

        //Exercicio b (numero de digitos)
        Scanner scanner = new Scanner(System.in);
        int x;
        int xDigitos = 1;

        System.out.println("Digite um numero: ");
        x = scanner.nextInt();

        while (x >= 10) {
            x /= 10;
            xDigitos++;
        }

        System.out.println("O numero de digitos é: " + xDigitos + "\n");

        //Exercicio c (arredondar a 2 casas decimais)
        aproximar2Digitos(4.78905, 4.7, 5.8954, 5);

        // Exercicio d
        imprimirNumero (0.456789);
    }
    public static void aproximar2Digitos(double valor1, double v1, double v, double valor) {
        System.out.println(new DecimalFormat("#,##0.00").format(valor1));
        System.out.println(new DecimalFormat("#,##0.00").format(v1));
        System.out.println(new DecimalFormat("#,##0.00").format(v1));
        System.out.println(new DecimalFormat("#,##0.00").format(valor));
    }

    public static void imprimirNumero (double v2) {
        System.out.println(new DecimalFormat ("#%").format(v2));
        System.out.println(new DecimalFormat("#,##0.000").format(v2));
        System.out.println(new DecimalFormat("#,##0.00").format(v2));
        System.out.println(new DecimalFormat("#,##0.0").format(v2));
    }

}