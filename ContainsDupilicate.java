public class ContainsDupilicate {
    
    public static void main(String... args){
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        ContainsDupilicate containsDupilicate = new ContainsDupilicate();
        boolean result = containsDupilicate.containsDuplicate(nums);
        System.out.println(result);
    }


    public boolean containsDuplicate(int[] nums){

        for(int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
