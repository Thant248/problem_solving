public class LengthOfLastWord {
    
    public static void main(String... args){
        
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        String s = "Hello World";
        int result = lengthOfLastWord.lengthOfLastWord(s);
        System.out.println(result);
    }
    public int lengthOfLastWord(String s){
        String[] ss = s.split(" ");
        int splitted = ss[ss.length -1].length();
        return splitted;
    }
}
