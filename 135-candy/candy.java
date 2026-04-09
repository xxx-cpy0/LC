class Solution {
    public int candy(int[] ratings) {
        int[] res = new int[ratings.length];
        int[] res1 = new int[ratings.length];
        Arrays.fill(res,1);
        Arrays.fill(res1,1);
        int i;
        for(i=1;i<ratings.length;i++){
            if(ratings[i - 1] < ratings[i]) res[i] = res[i - 1] + 1;
        }
        for(i=ratings.length - 2;i>=0;i--){
            if(ratings[i] > ratings[i + 1]) res1[i] = res1[i + 1] + 1;
        }
        int sum = 0;
        for(i=0;i<res.length;i++){
            sum += Math.max(res[i],res1[i]);
        }
        return sum;
    }
}