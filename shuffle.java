import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.List;

public class shuffle {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7 };

        // Shuffle the array using Fisher-Yates shuffle algorithm
        shuffleArray(array);

        System.out.println("Shuffled Array: " + Arrays.toString(array));
    }

    private static void shuffleArray(int[] array) {
        int n = array.length;
        Random random = new Random();

        for (int i = n - 1; i > 0; i--) {
            int randomIndex = random.nextInt(i + 1);

            int temp = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
        }
    }
}
