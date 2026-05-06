public class Search {

    public static int linearSearch(int[] arr, int search) {
        int check = 0;
        for (int i = 0; i < arr.length; i++) {
            check++;
            if (arr[i] == search) {
                System.out.println("Linear Search memeriksa sebanyak: " + check + " kali");
                return i;
            }
        }
        System.out.println("Linear Search memeriksa sebanyak: " + check + " kali");
        return -1;
    }
    public static int binarySearch(int[] arr, int search) {
        int check = 0;
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            check++;
            int mid = low + (high - low) / 2;
            if (arr[mid] == search) {
                System.out.println("Binary Search memeriksa sebanyak: " + check + " kali");
                return mid;
            }
            if (arr[mid] < search) low = mid + 1;
            else high = mid - 1;
        }
        System.out.println("Binary Search memeriksa sebanyak: " + check + " kali");
        return -1;
    }
    public static void main(String[] args) {
        int[] arrayTerurutAscending = {2, 5, 8, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 51, 55, 58, 62, 65, 68, 72, 75, 78, 81, 85, 88, 92, 95};

        System.out.println("Mencari elemen 88");
        int indeksLinear = linearSearch(arrayTerurutAscending, 88);
        int indeksBinary = binarySearch(arrayTerurutAscending, 88);
    }
}
