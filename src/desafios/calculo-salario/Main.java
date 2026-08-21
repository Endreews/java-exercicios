import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu número: ");
        int numFuncionario = scanner.nextInt();

        System.out.println("Informe suas horas trabalhadas: ");
        int numHorasTrab = scanner.nextInt();

        System.out.println("Informe seu valor por hora: ");
        double valorHora = scanner.nextDouble();

        double calculoHoras = numHorasTrab * valorHora;

        System.out.println("NUMBER = " + numFuncionario);
        System.out.println("SALARY = U$ " + calculoHoras);

    }
}
