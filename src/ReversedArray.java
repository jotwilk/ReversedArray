import java.util.Arrays;

public class ReversedArray {
    public static void main(String[] args) {
        int[] numbers = {350, 800, 990, 1200, 2000, 5500, 6800, 9999, 10001, 12000};
        int[] reversed = new int[10];

        for (int index = 0; index < numbers.length; index++) {
            int reversedIndex = numbers.length - 1 - index;
            reversed[index] = numbers[reversedIndex];
            System.out.println("index=" + index + ", reversedIndex=" + reversedIndex + ", val=" + numbers[reversedIndex]);

        }
        System.out.println("Tablica numbers: " + Arrays.toString(numbers));
        System.out.println("Tablica reversed: " + Arrays.toString(reversed));

    }
}
