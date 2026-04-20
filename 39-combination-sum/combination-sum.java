class Solution {
    int sum = 0;
    public void call(int[] candidates,int i,int t,List<List<Integer>> a,List<Integer> b){
        if(t == 0){
            a.add(new ArrayList<>(b));
            return;
        }
        if(i >= candidates.length || t < 0){
            return;
        }
        for(int id = i;id<candidates.length;id++){
            //sum += candidates[id];
            b.add(candidates[id]);
            call(candidates,id,t - candidates[id],a,b);
            b.remove(b.size() - 1);
            //b.remove(b.size() - 1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ll = new ArrayList<>();
        call(candidates,0,target,ll,new ArrayList<>());
        return ll;
    }
}