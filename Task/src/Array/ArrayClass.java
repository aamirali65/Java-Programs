package Array;

import java.util.Arrays;

public class ArrayClass {

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        return max;
    }

    public static void sortArray(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    public static boolean searchElement(int[] arr, int key) {
        for (int num : arr) {
            if (num == key) return true;
        }
        return false;
    }

    public static void reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }

    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) sum += num;
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 7, 2};
        System.out.println("Max: " + findMax(arr));
        sortArray(arr);
        System.out.println("Element 5 found: " + searchElement(arr, 5));
        reverseArray(arr);
        System.out.println("Sum: " + calculateSum(arr));
    }
}
