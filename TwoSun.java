class TwoSun {

    public static void main(String[] args) {
    TwoSun twoSun = new TwoSun();
    int[] nums = {2, 7, 11, 15};
    int target = 9;
    int[] result = twoSun.twoSum(nums, target);
    System.out.println(result[0] + " " + result[1]);    
}
public int[] twoSum(int[] nums, int target) {
      
    int length = nums.length;
    for (int i = 0; i < length; i++) {
        for (int j = i + 1; i < length; j++){
            if (nums[i] + nums[j] == target) {
                return new int[] {i, j};
            }
        }
    }
    return new int[]{};
}

}