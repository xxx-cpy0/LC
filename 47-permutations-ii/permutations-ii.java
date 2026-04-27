class Solution {
    public void swap(int[] nums,int a,int b){
        int t = nums[a];
        nums[a] = nums[b];
        nums[b] = t;
    }
    HashSet<List<Integer>> hs = new HashSet<>();
    public void helper(int[] nums,int idx,List<List<Integer>> b){
        if(idx == nums.length){
            List<Integer> a = new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                a.add(nums[i]);
            }
            if(!hs.contains(new ArrayList<>(a))) b.add(new ArrayList<>(a));
            hs.add(new ArrayList<>(a));
            return;
        }
        for(int i = idx;i<nums.length;i++){
            swap(nums,idx,i);
            helper(nums,idx + 1,b);
            swap(nums,idx,i);
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ll = new ArrayList<>();
        helper(nums,0,ll);
        return ll;
    }
}