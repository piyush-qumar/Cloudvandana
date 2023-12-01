import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        // Create a HashMap to store the mapping of Roman numerals to integers
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine().toUpperCase();

        int result = romanToInteger(romanNumeral, romanMap);

        System.out.println("The integer equivalent of " + romanNumeral + " is: " + result);
    }

    private static int romanToInteger(String romanNumeral, HashMap<Character, Integer> romanMap) {
        int result = 0;

        for (int i = 0; i < romanNumeral.length(); i++) {
            int currentValue = romanMap.get(romanNumeral.charAt(i));

            // If the next Roman numeral character has a higher value, subtract the current
            // value
            if (i + 1 < romanNumeral.length() &&
                    romanMap.get(romanNumeral.charAt(i + 1)) > currentValue) {
                result -= currentValue;
            } else {
                // Otherwise, add the current value
                result += currentValue;
            }
        }

        return result;
    }
}
