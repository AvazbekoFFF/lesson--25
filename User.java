import java.util.Scanner;

public class User {
    private Scanner inputScanner;

    public User() {
        inputScanner = new Scanner(System.in);
    }

    public Move getMove() {
        String userInput = inputScanner.nextLine();
        userInput = userInput.toUpperCase();
        char firstLetter = userInput.charAt(0);
        if (firstLetter == 'К' || firstLetter == 'Н' || firstLetter == 'Б') {
            switch (firstLetter) {
                case 'К':
                    return Move.ROCK;
                case 'Н':
                    return Move.SCISSORS;
                case 'Б':
                    return Move.PAPER;
            }
        }
        return getMove();
    }
        public boolean playAgain() {
            System.out.print("Хотите сыграть еще раз? ");
            String userInput = inputScanner.nextLine();
            userInput = userInput.toUpperCase();
            return userInput.charAt(0) == 'Д';
        }
    }

