import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int numero;
        int i;

        System.out.println("Digite um numero maior do que 1: ");
        numero = ler.nextInt();

        boolean primo = true;
        for (i = 2; i < numero; i++) {
            if (numero % i == 0) {
                primo = false;
            }
        }

        if(primo) {
            System.out.println("O numero é primo!");
        } else {
            System.out.println("O numero não é primo!");
        }
    }
}
