class Solution {
    HashSet<List<Integer>> hs = new HashSet<>();
    public void rajamayilpandian(int[] nums,int index,List<Integer> a,List<List<Integer>> b){
        if(index == nums.length){
            List<Integer> copy = new ArrayList<>(a);
            Collections.sort(copy);
            if(!hs.contains(new ArrayList<>(copy))){
                b.add(new ArrayList<>(a));
            }
            hs.add(copy);
            return;
        }
        a.add(nums[index]);
        rajamayilpandian(nums,index + 1,a,b);
        a.remove(a.size() - 1);
        rajamayilpandian(nums,index + 1,a,b);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ll = new ArrayList<>();
        rajamayilpandian(nums,0,new ArrayList<>(),ll);
        return ll;
    }
}