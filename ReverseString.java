public class ReverseString {
    public static void main(String... args){
        ReverseString reverseString = new ReverseString();
        char[] s = {'h','e','l','l','o'};
        reverseString.reverseString(s);

    }

    public void reverseString(char[] s){
        int left = s.length -1 ;
        int right = 0;

        while (left > right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left--;
            right++;
        }
    }
}
