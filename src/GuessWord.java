import java.util.Random;
import java.util.Scanner;

public class GuessWord {
    static String randomWord;
    static String uniqLetters;
    static String userWord;
    static String answer;
    static Scanner scn;

    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon",
                "banana", "apricot", "avocado",
                "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon",
                "leak", "kiwi", "mango",
                "mushroom", "nut", "olive",
                "pea", "peanut", "pear",
                "pepper", "pineapple", "pumpkin",
                "potato"};


        Random random = new Random();
        int index = random.nextInt(words.length);
        randomWord = words[index];
        uniqLetters = "";
        userWord = "";
        answer = "";
        scn = new Scanner(System.in);

        startGuessTheWordGame();

    }


    private static void startGuessTheWordGame() {

        while (!answer.equals(randomWord)) {

            System.out.println("Enter word: ");
            userWord = scn.nextLine().trim().toLowerCase();

            for (int i = 0; i < userWord.length(); i++) {
                if (uniqLetters.indexOf(userWord.charAt(i)) == -1) {
                    uniqLetters = uniqLetters + userWord.charAt(i);
                }
            }

            answer = "";

            for (int i = 0; i < randomWord.length(); i++) {
                if (uniqLetters.indexOf(randomWord.charAt(i)) > -1) {
                    answer = answer + randomWord.charAt(i);
                } else
                    answer = answer + "#";
            }
            System.out.println(answer);
        }
        System.out.println("Congratulation you win!");
    }
}

