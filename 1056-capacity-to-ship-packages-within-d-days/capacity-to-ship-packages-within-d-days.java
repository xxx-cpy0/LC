class Solution {
    public boolean check(int[] arr,int max,int days){
        int sum = 0,dc = 0,i;
        for(i=0;i<arr.length;i++){
            sum += arr[i];
            if(sum > max){
                dc++;
                sum = 0;
                sum += arr[i];
            }
        }
        if(dc < days) return true;
        return false;
    }
    public int shipWithinDays(int[] weights, int days) {
        int val = Integer.MIN_VALUE,sum = 0,i;
        for(i=0;i<weights.length;i++){
            sum += weights[i];
            if(weights[i] > val) val = weights[i];
        }
        int l = val,h = sum,min = Integer.MAX_VALUE;
        while(l <= h){
            int mid = l + (h - l) / 2;
            if(check(weights,mid,days) == true){
                if(min > mid) min = mid;
                h = mid - 1;
            }
            else l = mid + 1;
        }
        return min;
    }
}