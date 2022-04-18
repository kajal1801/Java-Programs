public class MaxSumSubarray {
    public int maxSubArray(int[] nums) {
        int maxi = 0, res = nums[0];
        for(int i = 0;i<nums.length;i++){
            maxi += nums[i];
            res = Math.max(maxi,res);
            if(maxi<0){ 
                maxi = 0;
            }
        }
        
        return res;
    }
}
