import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String... args){
        RomanToInteger romanToInteger = new RomanToInteger();
        System.out.println(romanToInteger.romanToInteger("II"));
    }


    public int romanToInteger(String s){

        Map<Character, Integer> mapData = new HashMap<>();

        mapData.put('I', 1);
        mapData.put('V', 5);
        mapData.put('X', 10);
        mapData.put('L', 50);
        mapData.put('C', 100);
        mapData.put('D', 500);
        mapData.put('M', 1000);

        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if ( i < s.length() - 1 && mapData.get(s.charAt(i)) < mapData.get(s.charAt(i + 1))) {
                System.out.println(mapData.get(s.charAt(i)));
                System.out.println(mapData.get(s.charAt(i + 1)));
                ans = ans-mapData.get(s.charAt(i));
                System.out.println("This is from minus");
                System.out.println(ans);
            }else {
                ans = ans+mapData.get(s.charAt(i));
                System.out.println("This is from plus");
                System.out.println(ans);
            }

        }
        return ans;

    }
}
