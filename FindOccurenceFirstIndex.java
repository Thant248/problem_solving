public class FindOccurenceFirstIndex {
    
    public static void main(String... args){
        FindOccurenceFirstIndex findOccurenceFirstIndex = new FindOccurenceFirstIndex();
        String hayStack = "c";
        String needle = "c";
        int result = findOccurenceFirstIndex.strstr(hayStack, needle);
        System.out.println(result);
    }


    public int strstr(String hayStack, String needle){
        int n = hayStack.length();
        int m = needle.length();

        if (needle.isEmpty()) {
            return 0;
        }

        if (m > n) {
            return -1;
        }

        for(int i=0;i<= n -m;i++){
            if (hayStack.substring(i, i + m).equals(needle)) {
                return i;
            }
        }

        return -1;

    }
}
