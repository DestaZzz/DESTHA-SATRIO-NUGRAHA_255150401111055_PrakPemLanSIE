import java.util.Arrays;

public class Sort {

    public static int[] bubble(int[] list) {
        int tukarAtauGeser = 0;
        for (int i = 0; i < list.length - 1; i++) {
            for (int k = i + 1; k < list.length; k++) {
                if (list[k] < list[i]) {
                    int t = list[i];
                    list[i] = list[k];
                    list[k] = t;
                    tukarAtauGeser++;
                }
            }
        }
        System.out.println("Bubble, Jumlah tukarAtauGeser: " + tukarAtauGeser);
        return list;
    }

    public static int[] insertion(int[] list) {
        int tukarAtauGeser = 0;
        for (int i = 1; i < list.length; ++i) {
            int key = list[i];
            int k = i - 1;
            while (k >= 0 && list[k] > key) {
                list[k + 1] = list[k];
                k = k - 1;
                tukarAtauGeser++;
            }
            list[k + 1] = key;
        }
        System.out.println("Insertion, Jumlah tukarAtauGeser: " + tukarAtauGeser);
        return list;
    }

    public static int[] selection(int[] list) {
        int tukarAtauGeser = 0;
        for (int i = 0; i < list.length - 1; i++) {
            int minIndex = i;
            for (int k = i + 1; k < list.length; k++) {
                if (list[k] < list[minIndex])
                    minIndex = k;
            }
            int t = list[minIndex];
            list[minIndex] = list[i];
            list[i] = t;
            tukarAtauGeser++;
        }
        System.out.println("Selection, Jumlah tukarAtauGeser: " + tukarAtauGeser);
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {
            3, 7, 12, 18, 23, 29, 34, 41, 47, 52,
            58, 63, 67, 71, 75, 79, 83, 86, 88, 91,
            94, 96, 15, 44, 55, 66, 77, 38, 22, 9
        };

        System.out.println("Array awal: " + Arrays.toString(arr));

        int[] arr1 = Arrays.copyOf(arr, arr.length);
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        int[] arr3 = Arrays.copyOf(arr, arr.length);

        System.out.println("\n--- Bubble Sort ---");
        System.out.println("Sebelum : " + Arrays.toString(arr1));
        System.out.println("Sesudah : " + Arrays.toString(bubble(arr1)));

        System.out.println("\n--- Insertion Sort ---");
        System.out.println("Sebelum : " + Arrays.toString(arr2));
        System.out.println("Sesudah : " + Arrays.toString(insertion(arr2)));

        System.out.println("\n--- Selection Sort ---");
        System.out.println("Sebelum : " + Arrays.toString(arr3));
        System.out.println("Sesudah : " + Arrays.toString(selection(arr3)));
    }
}