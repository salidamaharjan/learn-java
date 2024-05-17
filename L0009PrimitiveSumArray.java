// Create a program that has a method called sumArray
// the method will have array of ints as parameter
// the method will return sum of all number in an array
// When we run the program the sum of array needs to be printed.
public class L0009PrimitiveSumArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int sum = sumArray(arr);
        System.out.println(sum);
    }
    public static int sumArray(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        return sum;
    }
}