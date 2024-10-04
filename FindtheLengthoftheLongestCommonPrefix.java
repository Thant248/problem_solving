public class FindtheLengthoftheLongestCommonPrefix {
    
    public static void main(String... args){
        FindtheLengthoftheLongestCommonPrefix findtheLengthoftheLongestCommonPrefix = new FindtheLengthoftheLongestCommonPrefix();
        int[] arr1 = {1, 10, 100};
        int[] arr2 = {1000};
        int result = findtheLengthoftheLongestCommonPrefix.longestCommonPrefix(arr1, arr2);
        System.out.println(result);
    }


    public int longestCommonPrefix(int[] arr1, int[] arr2){
        int maxLength = 0;
        for (int i : arr1) {
            for (int j : arr2) {
                String s1 = String.valueOf(i);
                String s2 = String.valueOf(j);
                int length = commonPrefix(s1, s2);

                maxLength = Math.max(maxLength, length);
            }
           
        }
        return maxLength;
    }

    public static int commonPrefix(String s1, String s2){
        int minLength = Math.min(s1.length(), s2.length());
        int i = 0;

        while (i < minLength && s1.charAt(i) == s2.charAt(i)) {
            i++;
        }

        return i;
    }
}
