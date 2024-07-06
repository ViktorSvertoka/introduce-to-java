public class BinarySearch {
    // Метод для двійкового пошуку
    public static int binarySearch(int arr[], int elementToSearch) {
        int firstIndex = 0;
        int lastIndex = arr.length - 1;

        // умова припинення(елемент не представлено)
        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;

            // якщо середній елемент – цільовий елемент, повернути його індекс
            if (arr[middleIndex] == elementToSearch) {
                return middleIndex;
            }

            // якщо середній елемент менше
            // направляємо індекс у middle+1, забираючи першу частину з переглянутого
            else if (arr[middleIndex] < elementToSearch) {
                firstIndex = middleIndex + 1;
            }

            // якщо середній елемент більше
            // направляємо індекс у middle-1, забираючи другу частину з переглянутого
            else if (arr[middleIndex] > elementToSearch) {
                lastIndex = middleIndex - 1;
            }
        }
        return -1;
    }

    // Основний метод для запуску програми
    public static void main(String[] args) {
        // Приклад масиву
        int[] array = { 10, 20, 30, 40, 50 };

        // Елемент, який потрібно знайти
        int elementToSearch = 30;

        // Виклик методу двійкового пошуку
        int result = binarySearch(array, elementToSearch);

        // Виведення результату
        if (result != -1) {
            System.out.println("Елемент знайдено на індексі: " + result);
        } else {
            System.out.println("Елемент не знайдено.");
        }
    }
}



