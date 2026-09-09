package exercicios;

import java.util.Scanner;

public class CalculoSimples {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int codPeca1 = scanner.nextInt();
        int numeroPeca1 = scanner.nextInt();
        double valorPeca1 = scanner.nextDouble();

        int codPeca2 = scanner.nextInt();
        int numeroPeca2 = scanner.nextInt();
        double valorPeca2 = scanner.nextDouble();

        double calculoPeca1 = numeroPeca1 * valorPeca1;
        double calculoPeca2 = numeroPeca2 * valorPeca2;
        double valorTotal = calculoPeca1 + calculoPeca2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);

    }
}
