public class RemoveElement {
    
    public static void main(String... args){

        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        RemoveElement removeElement = new RemoveElement();
        int result = removeElement.removeElement(nums, val);
        System.out.println(result);
    }

    public int removeElement(int[] nums, int val){
        int index = 0;
        for(int i=0;i < nums.length;i++){
            if (nums[i] != val){
                nums[index] = nums[i];
                index++;
            }    
        }
        return index;
    }
}
