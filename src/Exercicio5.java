import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int x1, x2, x3;
        int a;

        System.out.println("Digite o primeiro numero: ");
        x1 = ler.nextInt();

        System.out.println("Digite o segundo numero: ");
        x2 = ler.nextInt();

        System.out.println("Digite o terceiro numero: ");
        x3 = ler.nextInt();

        a = x1;

        if (x2 > a) {
            a = x2;
        }
        if (x3 > a) {
            a = x3;
        }

        System.out.println("O maior numero é: " + a);
    }
}
