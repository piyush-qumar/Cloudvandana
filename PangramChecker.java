import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine().toLowerCase();

        boolean isPangram = checkPangram(inputSentence);

        if (isPangram) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }
    }

    private static boolean checkPangram(String sentence) {
        Set<Character> uniqueCharacters = new HashSet<>();

        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                uniqueCharacters.add(c);
            }
        }

        return uniqueCharacters.size() == 26;
    }
}
