public class L0006Array {
    public static void main(String[] args) {
        // int[] arrOfNum = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17,
        // 18, 19, 20 };
        int[] arrOfNum = new int[] { 1, 2, 3, 4, 5, 6, 7 };

        int idx = binarySearchIndex(2, arrOfNum);
        System.out.println(idx);
    }

    static int binarySearchIndex(int num, int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end) / 2;
        while (mid < end) {
            if (arr[mid] == num) {
                return mid;
            }
            if (arr[mid] < num) {
                start = mid + 1;
                mid = start + end / 2;
                System.out.println("s" + start);
            }
            if (arr[mid] > num) {
                end = mid - 1;
                mid = start + end / 2;

                System.out.println("e" + end);
            }
        }
        return -1;
    }
}
// Given you have a sorted array, find a index of number
// using binary search.