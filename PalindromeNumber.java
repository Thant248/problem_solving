public class PalindromeNumber {
    public static void main(String... args){
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        System.out.println(palindromeNumber.isPalindrome(121));
    }

    public boolean isPalindrome(int x){
        if( x < 0){
            return false;
        }

        int num = x;
        int reverse = 0;

        while (num != 0){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }

        return x == reverse;

    }
}
