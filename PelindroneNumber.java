public class PelindroneNumber {

    public static void main(String []args){
        PelindroneNumber pelindroneNumber = new PelindroneNumber();
        System.out.println(pelindroneNumber.isPalindrome(121));
    }
    public boolean isPalindrome(int x){
        if (x < 0) {
            return false;
        }

        int div = 0;
        int tempData = x;

        while (tempData != 0){
            int digit = tempData % 10;
            System.out.println(digit);
            div = div * 10 + digit;
            tempData = tempData / 10;
            System.out.println(div);
        }
        return (div == x);
    }
}
