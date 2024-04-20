package Algorithms;

public class L0002StringPalindrome {
    public static void main(String[] args) {
        String str = "AVAVA";
        System.out.println(isStingPalindrome(str));
    }

    static boolean isStingPalindrome(String str) {
        String lowerCase = str.toLowerCase();
        char[] charArray = lowerCase.toCharArray();
        double mid = Math.floor(charArray.length / 2);
        // System.out.println(mid);
        for (int i = 0; i < mid; i++) {
            if (charArray[i] != charArray[charArray.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
