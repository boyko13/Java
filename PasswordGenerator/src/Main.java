import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int passwordLength = 7;
        PassWordGenerator passWordGenerator = new PassWordGenerator(passwordLength);

        System.out.println("Podaj proszę jak długie ma być hasło: ");
        passwordLength = scanner.nextInt();

        passWordGenerator.generatorHasla(passwordLength);


    }
}