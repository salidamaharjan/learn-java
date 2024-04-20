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
        int comparing = charArray.length - 1;
        boolean palindrome = true;
        System.out.println(mid);
        for (int i = 0; i < mid; i++) {
            if (charArray[i] == charArray[comparing]) {
                comparing -= 1;
                palindrome = true;
            } else {
                return palindrome = false;
            }
        }
        return palindrome;
    }
}
