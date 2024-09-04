public class ValidPalindrom {
    public static void main(String... args){
        ValidPalindrom validPalindrom = new ValidPalindrom();
        String s = "A man, a plan, a canal";
        boolean result = validPalindrom.isPanlidrome(s);
        System.out.println(result);
    }

    public boolean isPanlidrome(String s){
        int head = 0;
        int tail = s.length()-1;
        while (head <= tail) {
            char cHead = s.charAt(head);
            char cTail = s.charAt(tail);
            if ((!Character.isLetterOrDigit(cHead))) {
                head++;
                continue;
            }
            if (!Character.isLetterOrDigit(cTail)) {
                tail--;
                continue;
            }

            if (Character.toLowerCase(cHead) != Character.toLowerCase(cTail)) {
                return false;
            }else {
                head++;
                tail--;
            }
        }
        

        return true;
    }
}
