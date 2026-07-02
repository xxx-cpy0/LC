class Solution {
    public int jump(int[] nums) {
        if(nums.length <= 1) return 0;
        int maxjump = 0;
        int i,c = 0,farthest = 0;
        for(i=0;i<nums.length - 1;i++){
            maxjump = Math.max(maxjump,i + nums[i]);
            if(i == farthest){
                c++;
                farthest = maxjump;
            }
        }
        return c;
    }
}