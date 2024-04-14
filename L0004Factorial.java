public class L0004Factorial {
    public static void main(String[] arg) {
        long factorial = factorial(10);
        System.out.println("Factorial of 10" + " = " + factorial);
    }
    static long factorial(long n){
        long factor = 1;
        for(int i = 2; i <= n; i++){
            factor = i * factor;
        }
        return factor;
    }
}
