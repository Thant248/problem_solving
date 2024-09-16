import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class MinimumTimeDifference {
    public static void main(String... args){
        MinimumTimeDifference minimumTimeDifference = new MinimumTimeDifference();
        List<String> timePoints = new ArrayList<>();
        timePoints.add("23:59");
        timePoints.add("00:00");
        int result = minimumTimeDifference.findMinDifference(timePoints);
        System.out.println(result);
    }


    public int findMinDifference(List<String> timePoints){
        int[] minutes = new int[timePoints.size()];
        for (int i = 0; i < timePoints.size(); i++) {
            minutes[i] = convertTimes(timePoints.get(i));
        }

        Arrays.sort(minutes);

        int minDiff = Integer.MAX_VALUE;
        int n = minutes.length;

        for (int i = 0; i < n; i++) {
            int diff = minutes[(i + 1) % n] - minutes[i];
            if (diff < 0) {
                diff += 1440; 
            }
            minDiff = Math.min(minDiff, diff);
        }

        return minDiff;
    }

    int convertTimes(String time){
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        return hours * 60 + minutes;
    }
}
