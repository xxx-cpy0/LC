class Solution {
    public int findPeakElement(int[] nums) {
        int l = 0,h = nums.length - 1,peak = 0,max = 0;
        if(nums.length == 1) return 0;
        while(l < h){
            int mid = l + (h - l) / 2;
            if(nums[mid] < nums[mid + 1]){
                peak = mid;
                l = mid + 1;
            }
            else{
                h = mid;
            }
        }
        return l;
    }
}