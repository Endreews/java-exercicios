package exercicios;

import entities.Account;

import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();

        System.out.println("Nome titular: ");
        account.holder = scanner.next();

        System.out.println("Saldo Inicial: ");
        account.balance = scanner.nextDouble();

        System.out.println("Deposito: ");
        account.balance = account.balance + scanner.nextDouble();

        System.out.println("Holder: " + account.holder);
        System.out.printf("Balance: $ %.2f%n", account.balance);

    }
}
