import java.util.*;

/**
 * Задание. Ввести n чисел с консоли.
 * <p>
 * 1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
 * <p>
 * 2. Вывести числа в порядке возрастания (убывания) значений их длины.
 * <p>
 * 3. Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.
 * <p>
 * 4. Найти число, в котором количество различных цифр минимально. Если таких чисел несколько, найти первое из них.
 * <p>
 * 5. Найти количество чисел, содержащих только четные цифры, а среди оставшихся — количество чисел с равным числом четных и нечетных цифр.
 * <p>
 * 6. Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.
 * <p>
 * 7. Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.
 */

public class OptionalTask1 {

    public static void main(String[] args) {

        System.out.print("Enter N: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter N numbers from console!");

        for (int i = 0; i < n; i++) {

            arr[i] = scanner.nextInt();

        }

        longAndShort(arr);
        System.out.println("\n2. \n");
        sortAsc(arr);
        sortDesc(arr);
        System.out.println("\n3. \n");
        System.out.print("Numbers less than average: ");
        lessThanAverage(arr);
        System.out.println("\nAverage length = " + averageLength(arr));
        System.out.println("\n6. \n");
        System.out.print("Number that have digits in ascending right: ");
        digitsAsc(arr);


    }

    public static void longAndShort(int[] arr) {

        int minIndex = 0;
        int maxIndex = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (counterOfDigits(arr[i]) <= min) {
                minIndex = i;
                min = counterOfDigits(arr[i]);
            }

            if (counterOfDigits(arr[i]) >= max) {
                maxIndex = i;
                max = counterOfDigits(arr[i]);
            }
        }
        System.out.println("\n1. \n");
        System.out.println("The shortest number is " + arr[minIndex] + ", length = " + min);
        System.out.println("The longest number is " + arr[maxIndex] + ", length = " + max);


    }

    public static int counterOfDigits(int number) {

        int count = 0;

        while (number != 0) {
            number = number / 10;
            count++;
        }
        return count;
    }

    public static void sortAsc(int[] arr) {

        int temp = 0;
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (counterOfDigits(arr[j]) > counterOfDigits(arr[j + 1])) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Numbers in ascending order:");
        System.out.println(Arrays.toString(arr));

    }

    public static void sortDesc(int[] arr) {

        int temp = 0;
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (counterOfDigits(arr[j]) < counterOfDigits(arr[j + 1])) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Numbers in descending order:");
        System.out.println(Arrays.toString(arr));

    }

    public static double averageLength(int[] arr) {

        int average = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            average += counterOfDigits(arr[i]);
            count++;
        }

        return (double) average / count;
    }

    public static void lessThanAverage(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            if (counterOfDigits(arr[i]) < averageLength(arr)) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void digitsAsc(int[] arr) {
        boolean asc = false;
        int ascIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            int[] mass = new int[counterOfDigits(arr[i])];
            int temp = arr[i];

            for (int j = counterOfDigits(arr[i]) - 1; j >= 0; j--) {
                int digit = temp % 10;
                mass[j] = digit;
                temp = temp / 10;
            }

            for (int k = 0; k < mass.length - 1; k++) {
                if ((mass[k + 1] - mass[k]) == 1) {
                    asc = true;
                }
            }
            if (asc == true) {
                ascIndex = i;
                break;
            }
        }
        System.out.println(arr[ascIndex]);
    }
}
