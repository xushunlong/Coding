package 排序算法;

public class QuickSort {



    public static void quickSort(int arr[], int low, int high) {
        if (low > high)
            return;
        int star = arr[low]; //哨兵
        int i = low;
        int j = high;
        while (i < j) {
            while (arr[j] >= star && i < j) {
                j--;
            }
            while (arr[i] <= star && i < j) {
                i++;
            }
            if (i < j) {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
        arr[low] = arr[i];
        arr[i] = star;
        quickSort(arr, low, j - 1);
        quickSort(arr, j + 1, high);
    }
}
