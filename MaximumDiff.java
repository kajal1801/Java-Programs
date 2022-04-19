public class MaximumDiff {
    public int maximumDifference(int[] nums) {
        int diff = -1, min = Integer.MAX_VALUE;
        for(int i = 0;i<nums.length;i++){
            min = Math.min(min, nums[i]);
            if(diff < (nums[i] - min)){
                diff = nums[i] - min;
            }
        }
        if(diff > 0){
            return diff;
        }
        return -1;
    }
}
