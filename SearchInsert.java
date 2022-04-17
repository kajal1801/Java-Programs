class SearchInsert {
    public int searchInsertion(int[] nums, int target) {
        int index = 0, start = 0, end = nums.length-1, mid;
        if(nums[end] < target){
            return end+1;
        }
        if(nums[start] > target){
            return start;
        }
        while(start<=end){
            mid = start + ((end-start)/2);
            if(nums[mid] == target){
                index = mid;
                break;
            }
            else if(nums[mid] < target){
                if(nums[mid+1] > target){
                    index = mid+1;
                    break;
                }
                else{
                    start = mid+1;
                }
            }
            else{
                if(nums[mid-1] < target){
                    index = mid;
                    break;
                }
                else{
                    end = mid-1;
                }
            }
        }
        return index;
    }
}
