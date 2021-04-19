package 排序算法;

public class FindKthmax {
    public static void main(String[] args) {
        int test[] = {3,2,3,1,2,4,5,5,6};
        int res = quickSort(test, 0, test.length - 1,test.length - 4);
        System.out.println(res);
//        for (int i = 0; i < test.length; i++) {
//            System.out.println(test[i]);
//        }
    }

    public static int quickSort(int arr[], int low, int high, int k) {
        if (low >= high)
            return arr[low];
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
        if (k <= j - 1)
            return quickSort(arr, low, j - 1, k);
        else if (k >= j + 1)
            return quickSort(arr, j + 1, high, k);
        else
            return arr[i];
    }
}
