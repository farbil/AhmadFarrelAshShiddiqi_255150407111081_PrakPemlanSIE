import java.util.Arrays;

public class Sort {

    public static int[] bubble(int[] list) {
        int tukarAtauGeser = 0;
        for (int i = 0; i < list.length - 1; i++) {
            for (int k = i + 1; k < list.length; k++) {
                if (list[k] > list[i]) {
                    int t = list[i];
                    list[i] = list[k];
                    list[k] = t;
                    tukarAtauGeser++;
                }
            }
        }
        System.out.println("Jumlah tukar/geser Bubble: " + tukarAtauGeser);
        return list;
    }

    public static int[] insertion(int[] list) {
        int tukarAtauGeser = 0;
        for (int i = 1; i < list.length; ++i) {
            int key = list[i];
            int k = i - 1;
            while (k >= 0 && list[k] < key) {
                list[k + 1] = list[k];
                k = k - 1;
                tukarAtauGeser++;
            }
            list[k + 1] = key;
        }
        System.out.println("Jumlah tukar/geser Insertion: " + tukarAtauGeser);
        return list;
    }

    public static int[] selection(int[] list) {
        int tukarAtauGeser = 0;
        for (int i = 0; i < list.length - 1; i++) {
            int minIndex = i;
            for (int k = i + 1; k < list.length; k++) {
                if (list[k] > list[minIndex])
                    minIndex = k;
            }
            int t = list[minIndex];
            list[minIndex] = list[i];
            list[i] = t;
            tukarAtauGeser++;
        }
        System.out.println("Jumlah tukar/geser Selection: " + tukarAtauGeser);
        return list;
    }

    public static void main(String[] args) {
        // ubah nilai default Array ini menjadi sebanyak 30 elemen
        // acak/tidak terurut dan nilai elemennya tidak ada yang ganda.
        int[] data = {45, 12, 89, 3, 76, 21, 58, 91, 14, 67, 34, 8, 50, 29, 95, 7, 62, 84, 19, 41, 73, 2, 55, 38, 99, 16, 48, 81, 26, 60};

        System.out.println("Array sebelum diurutkan:");
        System.out.println(Arrays.toString(data));

        // int[] sorted = bubble(data);
        // int[] sorted = insertion(data);
        int[] sorted = selection(data);
        System.out.println("Array setelah diurutkan:");
        System.out.println(Arrays.toString(sorted));
    }
}
