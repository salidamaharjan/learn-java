package Algorithms;

public class L0001TwoSum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 7 };
        int num = 8;
        int[] twoSumResult = twoSum(arr, num);
        System.out.println(twoSumResult[0] + " " + twoSumResult[1]);
    }

    static int[] twoSum(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                // System.out.println(arr[i] + "," + arr[j]);
                if (arr[i] + arr[j] == num) {
                    int[] newArr = { arr[i], arr[j] };
                    System.out.println(newArr + " " + "inside if block");
                    return newArr;
                }
            }
        }
        return null;
    }
}
// Given an array of integers nums and an integer target, return indices of the
// two numbers such that they add up to target
// [1,2,3,5,7], 9 returns array [1,4]