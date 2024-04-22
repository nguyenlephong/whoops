package algo.search;

public class LinearSearch<T> {

    public int searchLinearArray(T[] arr, T keyword) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(keyword)){
                return i;
            }
        }
        return -1;
    }
}
