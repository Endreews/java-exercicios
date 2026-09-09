package exercicios;

import java.util.Scanner;

public class OMaior {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int valor1 = scanner.nextInt();
        int valor2 = scanner.nextInt();
        int valor3 = scanner.nextInt();

        int maiorAB = (valor1 + valor2 + Math.abs(valor1 - valor2)) / 2;

        if (maiorAB > valor3) {
            System.out.println(maiorAB + " eh o maior");
        } else {
            System.out.println(valor3 + " eh o maior");
        }
    }
}
