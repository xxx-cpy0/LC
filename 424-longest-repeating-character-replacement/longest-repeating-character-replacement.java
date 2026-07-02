class Solution {
    public int characterReplacement(String s, int k) {
        int i,j,max = Integer.MIN_VALUE;
        char[] arr = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        for(i=0;i<arr.length;i++){
            int l=0,h=0,c=0,sum = 0;
            while(h < s.length()){
                if(s.charAt(h) != arr[i]) c++;
                if(c <= k) sum = h - l + 1;
                else if(c > k){
                    if(s.charAt(l) != arr[i]){
                        c--;
                        l++;
                    }
                    else l++;
                    sum = h - l + 1;
                }
                if(max < sum) max = sum;
                h++;
            }
        }
        return max;
    }
}