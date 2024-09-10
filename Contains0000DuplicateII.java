import java.util.HashMap;

public class Contains0000DuplicateII {
    public static void main(String... args){
        int[] nums = {1,2,3,4,5,3,6,7,8,9,10};
        int k = 3;
        Contains0000DuplicateII contains0000DuplicateII = new Contains0000DuplicateII();
        boolean result = contains0000DuplicateII.containsDuplicate(nums, k);
        System.out.println(result);
    }


    public boolean  containsDuplicate (int[] nums, int k){

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            
            if (map.containsKey(nums[i] ) && (i - map.get(nums[i]) <= k)) {

                return true;
            }

            map.put(nums[i], i);
        }
        return false;
    }
}
