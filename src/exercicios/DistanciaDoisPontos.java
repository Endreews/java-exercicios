package exercicios;

import java.util.Scanner;

public class DistanciaDoisPontos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double distanciaDoX = Math.pow(x2 - x1, 2) ;
        double distanciaDoY = Math.pow(y2 - y1, 2);
        double somaDosValores = distanciaDoX + distanciaDoY;

        double distancia = Math.sqrt(somaDosValores);

        System.out.printf("%.4f%n", distancia);
    }
}
