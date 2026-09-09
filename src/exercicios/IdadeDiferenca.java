package exercicios;

import java.util.Scanner;

public class IdadeDiferenca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String name1 = scanner.next();

        System.out.println("Informe sua idade: ");
        int age1 = scanner.nextInt();

        System.out.println("Informe seu nome: ");
        String name2 = scanner.next();

        System.out.println("Informe sua idade: ");
        int age2 = scanner.nextInt();

        int diferenca = Math.abs(age1 - age2);

        System.out.println("Olá, " + name1 + " e " + name2 +
                " a diferença de idade é de: " + diferenca + " anos");
    }
}
