class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        
        for(Integer num: nums){
            set.add(num);
        }

        int longest = 0;

        for(Integer num : set){
            if(set.contains(num - 1)){
                continue;
            }

            int length = 1;

            while(set.contains(num + 1 + length - 1)){
                length++;
            }

            longest = Math.max(length, longest);
            System.out.println("longest : " + longest);
        }

        return longest;
    }
}
