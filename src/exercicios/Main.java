import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numFuncionario = scanner.nextInt();
        int numHorasTrab = scanner.nextInt();
        double valorHora = scanner.nextDouble();

        double calculoHoras = numHorasTrab * valorHora;

        System.out.printf("NUMBER = %d%n", numFuncionario);
        System.out.printf("SALARY = U$ %.2f%n", calculoHoras);

        scanner.close();
    }
}