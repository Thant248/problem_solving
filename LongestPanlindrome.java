import java.util.HashSet;
public class LongestPanlindrome {
    public static void main(String[] args) {
        String s = "abccccdd";
        LongestPanlindrome longestPanlindromes = new LongestPanlindrome();
        int result = longestPanlindromes.longestPalindrome(s);
        System.out.println(result);
    }

    public int longestPalindrome(String s){
        HashSet<Character> set  = new HashSet<>();
        int count = 0;

        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                set.remove(c);
                count += 2;
            }else {
                set.add(c);
            }
        }

        if (!set.isEmpty()) {
            count +=1;
           }

        return count;
    }
}
