package algo.search;

public class BinarySearch {
    public int binarySearch(int[] arr, int value) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == value) return mid;
            else if (arr[mid] < value) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }
}
