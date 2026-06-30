class Solution {
    public void rotate(int[] nums, int k) {
        int i;
        List<Integer> ll = new ArrayList<>();
        for(i=0;i<nums.length;i++) ll.add(nums[i]);
        k = nums.length - (k % nums.length);
        int kk = 0,c = 0;
        while(c < nums.length){
            int idx = k % nums.length;
            nums[kk++] = ll.get(idx);
            k++;
            c++;
        }
    }
}