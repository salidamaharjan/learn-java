package Algorithms;

public class L0003FindClosestNumber {
    public static void main(String [] args) {
        int[] nums = {-4, -2, 1, 4, 8};
        int findClosest = findClosestNum(nums);
        System.out.println(findClosest);
    }
    static int findClosestNum (int[] nums) {
        int closestNum = nums[0];
        for (int i = 0; i < nums.length; i ++) {
            int curNum = nums[i];
            int curAbsNum = Math.abs(curNum);
            int closestAbsNum = Math.abs(closestNum);
            if (closestAbsNum > curAbsNum){
                closestNum = curNum;
            }
            if (closestAbsNum == curAbsNum && curAbsNum > closestAbsNum) {
                closestNum = curNum;
            }
        }
        return closestNum;
    }
}
