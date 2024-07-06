public class LinearSearch {
    // Метод для лінійного пошуку
    public static int linearSearch(int arr[], int elementToSearch) {
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == elementToSearch) {
                return index;
            }
        }
        return -1;
    }

    // Основний метод для запуску програми
    public static void main(String[] args) {
        // Приклад масиву
        int[] array = {10, 20, 30, 40, 50};

        // Елемент, який потрібно знайти
        int elementToSearch = 30;

        // Виклик методу лінійного пошуку
        int result = linearSearch(array, elementToSearch);

        // Виведення результату
        if (result != -1) {
            System.out.println("Елемент знайдено на індексі: " + result);
        } else {
            System.out.println("Елемент не знайдено.");
        }
    }
}



