class Solution {
    public void subset(int[] nums,int index,List<Integer> a,List<List<Integer>> b){
        if(index == nums.length){
            b.add(new ArrayList<>(a));
            return;
        }
        a.add(nums[index]);
        subset(nums,index + 1,a,b);
        a.remove(a.size()-1);
        subset(nums,index + 1,a,b);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> l1 = new ArrayList<>();
        subset(nums,0,new ArrayList<>(),l1);
        return l1;
    }
}