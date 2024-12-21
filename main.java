
import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numberToGuess = random.nextInt(100) + 1;
        int numberOfTries = 0;
        int guess;

        System.out.println("Угадайте число от 1 до 100:");

        while (true) {
            System.out.print("Введите ваш ответ: ");
            guess = scanner.nextInt();
            numberOfTries++;

            if (guess < numberToGuess) {
                System.out.println("Число больше.");
            } else if (guess > numberToGuess) {
                System.out.println("Число меньше.");
            } else {
                System.out.println("Вы угадали число за " + numberOfTries + " попытки!");
                break;
            }
        }
    }
}
