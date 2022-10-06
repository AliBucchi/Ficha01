import java.text.DecimalFormat;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
        Scanner ler = new Scanner(System.in);
        int x;
        int xDigitos = 1;

        System.out.println("Digite um numero: ");
        x = ler.nextInt();

        while (x >= 10) {
            x /= 10;
            xDigitos++;
        }

        System.out.println("O numero de digitos é: " + xDigitos + "\n");

        //Exercicio c (arredondar a 2 casas decimais)
        aproximar2Digitos(4.78905, 4.7, 5.8954, 5);

        // Exercicio d
        imprimirNumero (0.456789);

        //Exercicio e (imprimir datas e horas em diferentes formas)

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println(dtf.format(LocalDateTime.now()));

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(dtf2.format(LocalDateTime.now()));

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MM/yy");
        System.out.println(dtf3.format(LocalDateTime.now()));

        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        System.out.println(dtf4.format(LocalDateTime.now()));
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