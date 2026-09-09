package exercicios;

import entities.Rectangle;

import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Largula: ");
        rectangle.width = scanner.nextDouble();

        System.out.println("Altura: ");
        rectangle.height = scanner.nextDouble();

        double calculoArea = rectangle.width * rectangle.height;
        double calculoPerimetro = 2 * (rectangle.width + rectangle.height);
        double calculoDiagonal = Math.sqrt(
                Math.pow(rectangle.width, 2) +
                        Math.pow(rectangle.height, 2)
        );

        System.out.printf("AREA = %.2f%n", calculoArea);
        System.out.printf("PERIMETER = %.2f%n", calculoPerimetro);
        System.out.printf("DIAGONAL = %.2f%n", calculoDiagonal);
    }
}
