class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> {
            return a[0]-b[0];
        });
        int i;
        List<int[]> l = new ArrayList<>();
        l.add(new int[]{intervals[0][0],intervals[0][1]});
        for(i=1;i<intervals.length;i++){
            int[] arr = l.get(l.size() - 1);
            if(intervals[i][0] <= arr[1] && intervals[i][1] >= arr[1]){
                int[] temp = {arr[0],intervals[i][1]};
                l.remove(l.size()-1);
                l.add(temp);
            }
            else if(intervals[i][0] <= arr[1] && intervals[i][1] <= arr[1]) continue;
            else if(intervals[i][0] >= arr[1] && intervals[i][1] >= arr[1]) l.add(new int[]{intervals[i][0],intervals[i][1]});
        }
        int[][] res = new int[l.size()][2];
        for(i=0;i<l.size();i++){
            int[] te = l.get(i);
            res[i][0] = te[0];
            res[i][1] = te[1];
        }
        return res;
    }
}