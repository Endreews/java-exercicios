import java.time.OffsetDateTime;
import java.util.Scanner;

public class Ano {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int anoAtual = OffsetDateTime.now().getYear();

        System.out.println("Seu nome: ");
        String name = scanner.next();

        System.out.println("Seu ano de nascimento: ");
        int baseYear = scanner.nextInt();

        int age = anoAtual - baseYear;

        System.out.printf("Olá %s, você tem %s anos", name, age);
    }
}
