package desafios;

import entities.Triangle;

import java.util.Scanner;

public class triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangle x, y, z;
        x = new Triangle();
        y = new Triangle();
        z = new Triangle();

        System.out.println("Digite os lado x: ");
        x.lado1 = scanner.nextDouble();
        x.lado2 = scanner.nextDouble();
        x.lado3 = scanner.nextDouble();

        System.out.println("Digite os lado y: ");
        y.lado1 = scanner.nextDouble();
        y.lado2 = scanner.nextDouble();
        y.lado3 = scanner.nextDouble();

        double p = (x.lado1 + x.lado2 + x.lado3) / 2.0;
        double areaX = Math.sqrt(p * (p - x.lado1) * (p - x.lado2) * (p - x.lado3));

        p = (y.lado1 + y.lado2 + y.lado3) / 2.0;
        double areaY = Math.sqrt(p * (p - y.lado1) * (p - y.lado2) * (p - y.lado3));

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }

        scanner.close();
    }
}
