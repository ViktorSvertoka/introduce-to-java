public class InterpolationSearchDemo {

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int elementToSearch = 70;

        int result = interpolationSearch(array, elementToSearch);

        if (result != -1) {
            System.out.println("Елемент знайдено на індексі: " + result);
        } else {
            System.out.println("Елемент не знайдено.");
        }
    }

    public static int interpolationSearch(int[] integers, int elementToSearch) {
        int startIndex = 0;
        int lastIndex = integers.length - 1;

        while (startIndex <= lastIndex && elementToSearch >= integers[startIndex] && elementToSearch <= integers[lastIndex]) {
            int pos = startIndex + (((lastIndex - startIndex) / (integers[lastIndex] - integers[startIndex])) * (elementToSearch - integers[startIndex]));

            if (integers[pos] == elementToSearch) {
                return pos;
            }

            if (integers[pos] < elementToSearch) {
                startIndex = pos + 1;
            } else {
                lastIndex = pos - 1;
            }
        }
        return -1;
    }
}

