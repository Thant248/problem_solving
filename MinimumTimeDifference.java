import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class MinimumTimeDifference {
    public static void main(String... args){
        MinimumTimeDifference minimumTimeDifference = new MinimumTimeDifference();
        List<String> timePoints = new ArrayList<>();
        timePoints.add("23:59");
        timePoints.add("00:00");
        timePoints.add("00:00");
        int result = minimumTimeDifference.findMinDifference(timePoints);
        System.out.println(result);
    }


    public int findMinDifference(List<String> timePoints){

        int[] minutes = new int[timePoints.size()];

        for (int i = 0; i < timePoints.size(); i++) {
            
            String time = timePoints.get(i);
            int h = Integer.parseInt(time.substring(0,2));
            int m = Integer.parseInt(time.substring(3));
            minutes[i] = h * 60 + m;
        }

        Arrays.sort(minutes);

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < minutes.length - 1; i++) {
            ans = Math.min(ans, minutes[i + 1] + minutes[i]);
        }
        return Math.min(ans, 24 * 60 - minutes[minutes.length - 1 ] + minutes[0]);
    }
}
