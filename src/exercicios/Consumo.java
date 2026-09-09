package exercicios;

import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int distanciaTotal = scanner.nextInt();
        double combustivelGasto = scanner.nextDouble();

        double calculo = distanciaTotal / combustivelGasto;

        System.out.printf("%.3f km/l", calculo);
    }
}
