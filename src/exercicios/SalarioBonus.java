package exercicios;

import java.util.Scanner;


public class SalarioBonus {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nomeVendedor = scanner.next();
        double salarioFixo = scanner.nextDouble();
        double totalVendas = scanner.nextDouble();


        double comissao = totalVendas * 15 / 100;
        double calculo = salarioFixo + comissao;

        System.out.printf("TOTAL = R$ %.2f%n", calculo);
    }
}
