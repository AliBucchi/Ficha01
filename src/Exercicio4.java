import java.util.Scanner;
import java.lang.Math;

public class Exercicio4 {

    public static void main(String[] args) {
        int a, b, c;
        int delta;
        int x1;
        int x2;
        Scanner ler = new Scanner (System.in);

        System.out.println("Digite valor de a: ");
        a = ler.nextInt();

        System.out.println("Digite valor de b: ");
        b = ler.nextInt();

        System.out.println("Digite valor de c: ");
        c = ler.nextInt();

        System.out.println("A equação escrita foi:" + a + "x²" + "+" + b + "x" + "+" + c);

        delta = ((int) ((Math.pow(b,2)) - (4 * a *c)));
        System.out.println("O valor de delta é: " + delta);

        x1 = (((- b) + (int) (Math.sqrt(delta)))/ (2 * a));
        x2 = (((- b) - (int) (Math.sqrt(delta)))/ (2 * a));

        System.out.println("As raizes reais da equação são: " + x1 + " e " + x2);












    }
}
