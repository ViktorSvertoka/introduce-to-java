public class JumpSearch {
    public static int jumpSearch(int[] integers, int elementToSearch) {
        int arrayLength = integers.length;
        int jumpStep = (int) Math.sqrt(integers.length);
        int previousStep = 0;

        while (integers[Math.min(jumpStep, arrayLength) - 1] < elementToSearch) {
            previousStep = jumpStep;
            jumpStep += (int) Math.sqrt(arrayLength);
            if (previousStep >= arrayLength) {
                return -1;
            }
        }

        while (integers[previousStep] < elementToSearch) {
            previousStep++;
            if (previousStep == Math.min(jumpStep, arrayLength)) {
                return -1;
            }
        }

        if (integers[previousStep] == elementToSearch) {
            return previousStep;
        }

        return -1;
    }

    // Основний метод для запуску програми
    public static void main(String[] args) {
        // Приклад масиву
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        // Елемент, який потрібно знайти
        int elementToSearch = 70;

        // Виклик методу пошуку стрибками
        int result = jumpSearch(array, elementToSearch);

        // Виведення результату
        if (result != -1) {
            System.out.println("Елемент знайдено на індексі: " + result);
        } else {
            System.out.println("Елемент не знайдено.");
        }
    }
}
