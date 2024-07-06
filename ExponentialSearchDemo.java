import java.util.Arrays;

public class ExponentialSearchDemo {

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int elementToSearch = 70;

        int result = exponentialSearch(array, elementToSearch);

        if (result != -1) {
            System.out.println("Елемент знайдено на індексі: " + result);
        } else {
            System.out.println("Елемент не знайдено.");
        }
    }

    public static int exponentialSearch(int[] integers, int elementToSearch) {
        if (integers[0] == elementToSearch) {
            return 0;
        }

        int i = 1;
        while (i < integers.length && integers[i] <= elementToSearch) {
            i = i * 2;
        }

        return Arrays.binarySearch(integers, i / 2, Math.min(i, integers.length), elementToSearch);
    }
}

