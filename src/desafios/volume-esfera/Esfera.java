import java.util.Scanner;

public class Esfera {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double raio = scanner.nextFloat();

        double calculo = (4.0 / 3) * 3.14159 * Math.pow(raio, 3);

        System.out.printf("VOLUME = %.3f%n", calculo);

    }
}
