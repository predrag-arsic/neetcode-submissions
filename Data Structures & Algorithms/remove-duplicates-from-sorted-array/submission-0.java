class Solution {
    public int removeDuplicates(int[] nums) {
        int length = nums.length, left = 0, right = 0;

        while(right < length){
            nums[left] = nums[right];

            while(right < length && nums[right] == nums[left]){
                right++;
            }

            left++;
        }
        
        return left;
    }
}