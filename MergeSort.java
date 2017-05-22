public class MergeSort {

    static int[] numbers = {101,8, 9, 6, 5, 1, 2, 3, 5, 9, 10, 0};
    static int n = 12;

    static void mergeSort(int left, int right) {
        if (left < right) {
            int middle = left + (right- left) / 2;
            mergeSort(left, middle);
            mergeSort(middle + 1, right);
            merge(left, middle, right);
        }
    }

    static void merge(int left, int middle, int right) {
        int temp[] = new int[n];
        for (int i = left; i <= right; i++) {
            temp[i] = numbers[i];
        }
        int i = left, j = middle + 1;
        int k = left;
        while (i <= middle && j <= right) {
            if (temp[i] < temp[j]) {
                numbers[k++] = temp[i++];
            } else {
                numbers[k++] = temp[j++];
            }
        }

        while (i++ <= middle) {
            numbers[k++] = temp[i - 1];
        }
        while (j++ <= right) {
            numbers[k++] = temp[j - 1];
        }
    }

    public static void main(String[] args) {
        mergeSort(0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.println(numbers[i]);
        }
    }

}

