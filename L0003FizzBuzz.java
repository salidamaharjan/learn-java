public class L0003FizzBuzz {
    public static void main(String[] args) {
        int num = 20;
        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " = " + "FizzBuzz!");
            } else if (i % 3 == 0) {
                System.out.println(i + " = " + " Fizz!");
            } else if (i % 5 == 0) {
                System.out.println(i + " = " + "Buzz!");
            } else {
                System.out.println(i);
            }
        }
    }
}
