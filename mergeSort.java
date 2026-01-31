public class mergeSort {

    static void merge(int arr[], int start, int mid, int end) {
        int temp[] = new int[end - start + 1];
        int i = start, j = mid + 1, k = 0;

        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= end) {
            temp[k++] = arr[j++];
        }

        for (int x = 0; x < temp.length; x++) {
            arr[start + x] = temp[x];
        }
    }

    static void sort1(int arr[], int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;

            sort1(arr, start, mid);       // left half
            sort1(arr, mid + 1, end);     // right half
            merge(arr, start, mid, end);  // merge both
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 3, 8, 2, 1};

        sort1(arr, 0, arr.length - 1);

        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
