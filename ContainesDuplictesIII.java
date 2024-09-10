import java.util.TreeSet;
public class ContainesDuplictesIII {
    public static void main(String... args){
        int[] nums = {-3,3,-6};
        ContainesDuplictesIII containesDuplictesIII = new ContainesDuplictesIII();
        boolean result = containesDuplictesIII.containsDuplicate(nums, 2, 3);
        System.out.println(result);
    }

    public boolean containsDuplicate(int[] nums, int k, int t){
       if (nums == null || nums.length == 0 || k <=0) {
        return false;
       } 

       TreeSet<Long> set = new TreeSet<>();
       for (int i = 0; i < nums.length; i++) {
         
        long num = (long) nums[i];

        Long ceiling = set.ceiling(num + k);
        Long floor = set.floor(num - t);
 
        if (floor != null && floor >= t || ceiling != null && ceiling <= t) {
            return true;
            
        }
        set.add(num);
        if (i >= k) {
            set.remove((long) nums[i - k]);
        }
       }
       return false;
    }
}
