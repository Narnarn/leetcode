public class Palindrome {
    public static boolean isPalindrome(int num) {
        if (num < 0) {
            return false;
        }
        int zeroNum = num;
        int res = 0;
        while (zeroNum != 0) {
            res *= 10;
            res += zeroNum % 10;
            zeroNum /= 10;
        }
        if (res == num) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.print(isPalindrome(121));
    }
}