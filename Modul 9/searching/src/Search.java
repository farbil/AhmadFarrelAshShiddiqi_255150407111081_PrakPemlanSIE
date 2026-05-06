public class Search {

    public static int linearSearch(int[] arr, int search) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) return i;
        }
        return -1;
    }
    public static int binarySearch(int[] arr, int search ) {
        int low = 0, high = arr.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == search) return mid;
            if (arr[mid] < search) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arrayTerurutAscending = {2, 5, 8, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 51, 55, 58, 62, 65, 68, 72, 75, 78, 81, 85, 88, 92, 95};
    }
}
