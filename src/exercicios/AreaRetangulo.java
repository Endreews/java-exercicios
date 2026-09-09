package exercicios;

import java.util.Scanner;

public class AreaRetangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a base do retângulo: ");
        int base = scanner.nextInt();

        System.out.println("Informe a altura do retângulo: ");
        int altura = scanner.nextInt();

        int area = base * altura;

        System.out.printf("O valor da área é: %s", area);

    }
}
