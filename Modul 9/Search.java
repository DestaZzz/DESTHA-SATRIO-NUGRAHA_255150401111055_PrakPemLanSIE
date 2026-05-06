import java.util.Arrays;

public class Search {

    public static int linearSearch(int[] arr, int search) {
        int check = 0;

        for (int i = 0; i < arr.length; i++) {
            check++;
            if (arr[i] == search) {
                System.out.println("Linear Search - jumlah pengecekan: " + check);
                return i;
            }
        }

        System.out.println("Linear Search - jumlah pengecekan: " + check);
        return -1;
    }

    public static int binarySearch(int[] arr, int search) {
        int check = 0;
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            check++;
            if (arr[mid] == search) {
                System.out.println("Binary Search - jumlah pengecekan: " + check);
                return mid;
            }

            if (arr[mid] < search) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Binary Search - jumlah pengecekan: " + check);
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {
            2, 5, 9, 13, 17, 21, 25, 28, 32, 36,
            40, 43, 47, 51, 55, 58, 62, 66, 70, 74,
            77, 80, 83, 85, 87, 88, 90, 93, 96, 99
        };

        System.out.println("Array: " + Arrays.toString(arr));

        int indexLinear = linearSearch(arr, 88);
        int indexBinary = binarySearch(arr, 88);

        System.out.println("Index linear search: " + indexLinear);
        System.out.println("Index binary search: " + indexBinary);
    }
}