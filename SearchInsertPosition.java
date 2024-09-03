public class SearchInsertPosition {

    public static void main(String... args){
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int[] nums = {1,3,5,6};
        int target = 7;
        searchInsertPosition.searchInsertPosition(nums, target);

    }

    public int searchInsertPosition(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;

        while (left <= right){
            int mid = left + (right - left)/2;
            System.out.println(mid);

            if (nums[mid] == target){
                return mid;
            }else if (nums[mid] < target){
                left = mid + 1;
            }else {
                right = mid - 1;    
            }
        }
       return  left;
    }
}
