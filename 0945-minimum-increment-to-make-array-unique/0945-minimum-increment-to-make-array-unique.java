class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int mov=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>=nums[i]){
                int need=nums[i-1]+1;
                mov=mov+need-nums[i];
                nums[i]=need;
            
            }
        }
        return mov;
    }
}