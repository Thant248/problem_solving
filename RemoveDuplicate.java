public class RemoveDuplicate {

    public static void main(String... args){

        int[] nums = {1,3,4,4,4,5};
        RemoveDuplicate removeDuplicate = new  RemoveDuplicate();
        int removedLength = removeDuplicate.removeDuplicates(nums);
        System.out.println(removedLength);
    }

    public int removeDuplicates(int[] nums) {
        int k = 1;
        for (int i=1; i < nums.length; i++) {
            if (nums[i] != nums[ i - 1]) {
                nums[k] = nums[i];
                k++;
            } 
        }
        return k;
    }
}
