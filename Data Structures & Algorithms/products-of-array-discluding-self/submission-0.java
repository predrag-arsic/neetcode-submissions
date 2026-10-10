class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] out = new int[nums.length];
        
        int productOfLeft = 1;
        for(int left = 0; left < nums.length; left ++){
            out[left] = productOfLeft;
            productOfLeft = productOfLeft * nums[left];
        }

        int productOfRight = 1;
        for (int right = nums.length - 1; right >= 0; right--){
            out[right] = out[right] * productOfRight;
            productOfRight = productOfRight * nums[right];
        }

        return out;
    }
}  
