class Solution {
    public int maxSubArray(int[] nums) {
        int max_so_far=0,curr_max=0;
        int i;
        for(i=0;i<nums.length;i++){
            max_so_far += nums[i];
        }
        for(i=0;i<nums.length;i++){
            curr_max += nums[i];
            if(max_so_far < curr_max){
                max_so_far = curr_max;
            }
            if(curr_max < 0)
                curr_max = 0;
                
        
    }
        return max_so_far;
    }
}
